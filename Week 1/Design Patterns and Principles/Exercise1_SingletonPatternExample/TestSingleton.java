public class TestSingleton {
  public static void main(String[] args) {
    Logger log1 = Logger.getInstance();
    Logger log2 = Logger.getInstance();

    if (log1 == log2)
      System.out.println("Both logger instances are the same.");
    else
      System.out.println("Logger instances are different.");
  }
}