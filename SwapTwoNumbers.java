public class SwapTwoNumbers 
{

 public static void main(String[] args) {
  int x = 10;
  int y = 20;

  System.out.println("Before Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);

  //swap the value
  swap(x, y);
 }

 private static void swap(int x, int y) {
  int temp = x;
  x = y;
  y = temp;

  System.out.println("After Swapping");
  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);
 }
}