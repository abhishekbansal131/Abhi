public class Abc {
    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);


        // char c="a"; error because character is specified in single code
        //   char c='a';

        char f = 98;
        System.out.println(f);
        System.out.println(Integer.toHexString(f));
        char ch = '\u0062'; // This step is equal to char f=98 because 0061 is hexadecimal rep. of 98;
        System.out.println(ch);
        String s = "apple";
        String p = "\u0061pple";
        System.out.println(s + " " + p);
    }
}