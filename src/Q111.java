interface test{
    void square();
}
public class Q111 implements test {
    public void square() {
        System.out.println("In square method");
    }
}

class Q11Main{
    public static void main(String[] args) {
        Q111 obj =new Q111();
        obj.square();
    }
}
