package FactoryPattern.ComputerModel.SubClass;

import FactoryPattern.ComputerModel.SuperClass.Computer;

public class PC extends Computer {

  public PC(String ram, String hdd, String cpu) {
    super(ram, hdd, cpu);
  }
  public void playGame() {
    System.out.println("This computer is for playing games");
  }
}
