public class CaculatorTest {
   public static void main(String[] args) {
      Calculator calculator = new Calculator();

      // test saves programmer of the action of typing the input
      double result = calculator.add(10, 50);

      // but programmer still needs to monitor the output
      if (result != 60) {
         System.out.println("Bad result: " + result);
      }
   }
}
