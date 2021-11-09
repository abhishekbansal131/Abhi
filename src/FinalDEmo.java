public class FinalDEmo {
    final double pi;
    public FinalDEmo(){
        pi=3.14;
    }
    public FinalDEmo(double pi){
        this.pi=pi;
    }
}
class FinalMain{
    public static void main(String[] args) {
        FinalDEmo obj = new FinalDEmo(22/7);
        System.out.println(obj.pi); //double(22/7)==3.0
    }
}
