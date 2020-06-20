package SingletonPattern;

import FactoryPattern.ComputerFactory;
import FactoryPattern.ComputerModel.SubClass.PC;
import FactoryPattern.ComputerModel.SubClass.Server;

public class Main {

    public static void main (String[] args) throws Exception {

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

    }
}
