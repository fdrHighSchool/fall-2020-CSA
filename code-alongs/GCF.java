public class GCF{
  public static void main(String[] args) {
    System.out.println(gcf(4, 10));

    System.out.println(gcf(3, 7));

    System.out.println(gcf(15, 25));

    System.out.println(gcf(12334, 345345234));
  }//end main

  /*
   * N: gcf()
   * P: determine the largest factor that two numbers have in common
   * I: the two numbers (int a , int b)
   * R: the gcf (int)
   */
  public static int gcf(int a, int b){
    int min;
    if (a < b){
      min = a;
    } else if (b < a) {
      min = b;
    } else {
      return a;
    }

    for (int i = min; i >= 1; i--){
      if (a % i == 0 && b % i == 0){
        return i;
      }
    }
    return 0;
  }
}//end class
