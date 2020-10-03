package BuilderPattern;

public class Main {
  public static void main (String[] args) {
    Laptop laptop = new Laptop.LaptopBuilder()
            .ram("8 gb")
            .cpu("4 ghz")
            .hdd("100 GB")
            .build();
  }
}
