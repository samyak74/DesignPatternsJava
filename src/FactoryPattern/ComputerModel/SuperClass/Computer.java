package FactoryPattern.ComputerModel.SuperClass;

public class Computer {
  private String ram;
  private String hdd;
  private String cpu;

  public Computer(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.cpu = cpu;
    this.hdd = hdd;
  }

  private String getRam() {
    return ram;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

  private String getHdd() {
    return hdd;
  }

  public void setHdd(String hdd) {
    this.hdd = hdd;
  }

  private String getCpu() {
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
