package FactoryPattern;

import FactoryPattern.ComputerFactory;
import FactoryPattern.ComputerModel.SubClass.PC;
import FactoryPattern.ComputerModel.SubClass.Server;
import SingletonPattern.BillPughSingleton;
import SingletonPattern.EagerInitializationSingleton;
import SingletonPattern.LazyInitializationSingleton;
import SingletonPattern.StaticInitializationSingleton;

public class Main {

    public static void main (String[] args) throws java.lang.Exception {
      //Factory Pattern
      PC personalComputer = (PC) ComputerFactory.getComputer("PC", "16GB", "1TB", "3Ghz");
      Server officeServer = (Server) ComputerFactory.getComputer("server", "128GB", "2TB", "5Ghz");
      PC pc = new PC("8GB", "200GB", "2.1Ghz");
      pc.playGame();
      personalComputer.playGame();
      officeServer.handleRequest();
    }
}
