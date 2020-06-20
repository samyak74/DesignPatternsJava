package FactoryPattern;

import FactoryPattern.ComputerModel.SubClass.PC;
import FactoryPattern.ComputerModel.SubClass.Server;
import FactoryPattern.ComputerModel.SuperClass.Computer;

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
