package FactoryPattern;

import FactoryPattern.ComputerModel.SubClass.PC;
import FactoryPattern.ComputerModel.SubClass.Server;
import FactoryPattern.ComputerModel.SuperClass.Computer;

public class ComputerFactory {

  public static Computer getComputer(String type, String ram, String hdd, String cpu) {
    switch(type.toLowerCase())
    {
      case "pc": return new PC(ram, hdd, cpu);
      case "server": return new Server(ram, hdd, cpu);
      default: return new Computer(ram, hdd, cpu);
    }
  }
}
