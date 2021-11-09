public class String_ {
    public static void main(String[] args) {
        String s = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));
        System.out.println(s==s2);
        System.out.println(s==s3);
        System.out.println(s3==s4);
        s=s.concat(" world");
        System.out.println(s);
    }
}
