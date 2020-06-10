package FactoryPattern.SuperClass;

public class Computer {
  String ram;
  String hdd;
  String cpu;

  public Computer(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.cpu = cpu;
    this.hdd = hdd;
  }

  public String getRam() {
    return ram;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

  public String getHdd() {
    return hdd;
  }

  public void setHdd(String hdd) {
    this.hdd = hdd;
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  @Override
  public String toString() {
    return "RAM= "+this.getRam()+", HDD="+this.getHdd()+", CPU="+this.getCpu();
  }
}
