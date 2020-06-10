package SingletonPattern;

// Initialized even if not used
public class StaticInitializationSingleton {
  private static StaticInitializationSingleton staticInitializationSingleton;
  static {
    try {
      staticInitializationSingleton = new StaticInitializationSingleton();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  private StaticInitializationSingleton() {
  }

  public static StaticInitializationSingleton getInstance() {
    return staticInitializationSingleton;
  }

}
