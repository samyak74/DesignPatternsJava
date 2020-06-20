package BuilderPattern;

public class Main {
  public static void main (String[] args) {
    Laptop laptop = new Laptop.LaptopBuilder()
            .ram("16 gb")
            .cpu("3 ghz")
            .hdd("100 GB")
            .build();
  }
}
