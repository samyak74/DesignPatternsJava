package FactoryPattern;

import FactoryPattern.SubClass.PC;
import FactoryPattern.SubClass.Server;
import FactoryPattern.SuperClass.Computer;

public class ComputerFactory {

  public static Computer getComputer(String type, String ram, String hdd, String cpu) {
    if (type.equalsIgnoreCase("PC")) {
      return new PC(ram, hdd, cpu);
    } else if (type.equalsIgnoreCase("Server")) {
      return new Server(ram, hdd, cpu);
    }
    return new Computer(ram, hdd, cpu);
  }
}
