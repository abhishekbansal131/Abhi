import java.math.BigInteger;

public class Big_Integer {
    static BigInteger f = BigInteger.valueOf(1);
    public static void display(int n){
        for(int i=2; i<=n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }

}

class BigIntegerMain{
    public static void main(String[] args) {
    //    Big_Integer.display(20);
        BigInteger a,b,c;
        a=BigInteger.valueOf(19);
   //     System.out.println(a);
        b = new BigInteger("1234567988854775222368");
   //     System.out.println(b.add(a));
        c=BigInteger.TEN;
   //     System.out.println(c);
        System.out.println(a.add(c) + " " + a.multiply(c) + " " + a.subtract(c) + " " + a.divide(c) + " " + a.remainder(c));
        System.out.println(a.compareTo(b));
        System.out.println(a.pow(2));
    }
}
