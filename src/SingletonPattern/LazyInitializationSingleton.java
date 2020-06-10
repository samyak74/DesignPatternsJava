package SingletonPattern;

// Not thread safe as multiple threads can be in getInstance method
public class LazyInitializationSingleton {
  private static LazyInitializationSingleton lazyInitializationSingleton;

  private LazyInitializationSingleton() {}

  public static LazyInitializationSingleton getInstance() {
    if (lazyInitializationSingleton != null )
      return lazyInitializationSingleton;
    try {
      lazyInitializationSingleton = new LazyInitializationSingleton();
    } catch (Exception e) {
      //LOG
    }
    return lazyInitializationSingleton;
  }

}
