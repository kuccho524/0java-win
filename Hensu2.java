class Hensu2 {

  public static void main(String[] args) {
    int a, b, c;

     a = 100;
     b = 200;
     c = 300;

     int tmp1 = c;
     int tmp2 = a;

     c = b;
     a = tmp1;
     b = tmp2;

     System.out.println("a = " + a);
     System.out.println("b = " + b);
     System.out.println("c = " + c);
  }

}