public class Q113 {
    private int x,y;
    public Q113(){
        x=10;
        y=20;
    }
    public Q113(int x , int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Main100{
    public static void main(String[] args) {
        Q113 obj = new Q113();
        Q113 obj2 = new Q113(1,2);
        obj.setX(10);
        obj.setY(20);
        obj.setXY(30,40);

        obj2.setY(10);
        obj2.setX(20);
        obj2.setXY(40,60);
    }
}
