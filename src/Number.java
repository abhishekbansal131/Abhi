public class Number {
    public static void powerInt(int num1, int num2){
        System.out.println(Math.pow(num1,num2));
    }
    public static void powerDouble(double num1, int num2){
        System.out.println(Math.pow(num1,num2));
    }
}
class NumberMain{
    public static void main(String[] args) {
        Number.powerInt(2,4);
        Number.powerDouble(3,4);
    }
}
