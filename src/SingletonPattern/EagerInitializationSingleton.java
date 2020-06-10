package SingletonPattern;


// Initialized even if not used
public class EagerInitializationSingleton {
  private static final EagerInitializationSingleton SINGLETON_INSTANCE = new EagerInitializationSingleton();

  private EagerInitializationSingleton() {
  }

  public static EagerInitializationSingleton getInstance() {
    return SINGLETON_INSTANCE;
  }
}
