class Hensu3 {
  public static void main(String[] args) {

    var height = 1.75;
    var weight = 65.0;
    var bmi = weight / (height * height);

    System.out.println("身長" + height + "m, 体重" + weight + "kgの肥満度は");
    System.out.println(bmi + "です。");
  }
}