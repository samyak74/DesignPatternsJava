import FactoryPattern.ComputerFactory;
import FactoryPattern.SubClass.PC;
import FactoryPattern.SubClass.Server;
import SingletonPattern.BillPughSingleton;
import SingletonPattern.EagerInitializationSingleton;
import SingletonPattern.LazyInitializationSingleton;
import SingletonPattern.StaticInitializationSingleton;

public class RunApp {

    public static void main (String[] args) throws java.lang.Exception {

      //compare the address of both instances
      //EagerInitialization Singleton
      EagerInitializationSingleton singleton = EagerInitializationSingleton.getInstance();
      EagerInitializationSingleton singleton1 = EagerInitializationSingleton.getInstance();

      //StaticBlock Singleton
      StaticInitializationSingleton staticInitializationSingleton = StaticInitializationSingleton.getInstance();
      StaticInitializationSingleton staticInitializationSingleton1 = StaticInitializationSingleton.getInstance();

      //LazyInitialization Singleton
      LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();
      LazyInitializationSingleton lazyInitializationSingleton1 = LazyInitializationSingleton.getInstance();

      //BillPugh
      BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
      BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();

      //Factory Pattern
      PC personalComputer = (PC) ComputerFactory.getComputer("PC", "16GB", "1TB", "3Ghz");
      Server officeServer = (Server) ComputerFactory.getComputer("server", "128GB", "2TB", "5Ghz");
      PC pc = new PC("8GB", "200GB", "2.1Ghz");
      pc.playGame();
      personalComputer.playGame();
      officeServer.handleRequest();
    }
}
