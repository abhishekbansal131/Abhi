public class InstanceBlock {
    static int count;
    int a;
    int b;
    {
        count++;  // Here we used the instance block which is invoked before the constructor
    }
    InstanceBlock(){
     //   count++;
        a=10;
        b=20;
    }
   // count++;
    InstanceBlock(int x,int y){
        //count++;
        a=x;
        b=y;
    }
    public void show(){
        System.out.println(a);
        System.out.println(b);
    }
}

class InstanceMAin{
    public static void main(String[] args) {
        InstanceBlock obj1=new InstanceBlock();
        InstanceBlock obj2=new InstanceBlock(10,20);
        System.out.println(InstanceBlock.count);
    }

}
