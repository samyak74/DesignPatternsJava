package BuilderPattern;

public class Laptop {
  private String ram;
  private String hdd;
  private String cpu;

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
    return super.toString();
  }

  static class LaptopBuilder {
    public String ram;
    public String hdd;
    public String cpu;

    //public Laptop laptop = new Laptop();
    public LaptopBuilder() {
    }

    public LaptopBuilder ram(String ram) {
      this.ram = ram;
      return this;
    }

    public LaptopBuilder hdd(String hdd) {
      this.hdd = hdd;
      return this;
    }

    public LaptopBuilder cpu(String cpu) {
      this.cpu = cpu;
      return this;
    }

    public Laptop build() {
      Laptop laptop = new Laptop();
      laptop.cpu = this.cpu;
      laptop.hdd = this.hdd;
      laptop.ram = this.ram;

      return laptop;
    }

  }
}
