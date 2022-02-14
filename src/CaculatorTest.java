public class CaculatorTest {

   private int nbErrors = 0;

   // move the test into seperate method
   // main method is easier to maintain
   public void testAdd() {
      Calculator calculator = new Calculator();
      double result = calculator.add(10, 50);
      if (result != 60) {
         throw new IllegalStateException("Bad result: " + result);
      }
   }

   public static void main(String[] args) {
      CaculatorTest test = new CaculatorTest();

      try {
         test.testAdd();
      } catch (Throwable e) {
         test.nbErrors++;
         e.printStackTrace();
      }

      if (test.nbErrors > 0) {
         throw new IllegalStateException("There were " + test.nbErrors + "error(s)");
      }
   }
}
