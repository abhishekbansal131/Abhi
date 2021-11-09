public class Room {
    boolean AC_ON;
    boolean HOME_THEATRE_ON;
    boolean FAN_ON;
    boolean LIGHT_ON;
    int acload,theatreload,fanload,lightload,sum;

    Room(boolean ac, boolean hometheatre, boolean fan, boolean light){
        AC_ON=ac;
        HOME_THEATRE_ON=hometheatre;
        FAN_ON=fan;
        LIGHT_ON=light;
    }
    Room(){
        acload=1200;
        theatreload=600;
        fanload=400;
        lightload=100;
        sum=0;
    }
}
class RoomMain{
    public static void main(String[] args) {
        Room obj = new Room(true, true,true, false);
        Room obj2 = new Room();
        if(obj.AC_ON==true){
            obj2.sum+=obj2.acload;
            System.out.println("Ac on");}
        if(obj.HOME_THEATRE_ON==true){
            obj2.sum+= obj2.theatreload;
            System.out.println("Home Theatre on");}
        if(obj.FAN_ON==true){
            obj2.sum+= obj2.fanload;
            System.out.println("fan on");}
        if(obj.LIGHT_ON==true){
            obj2.sum+= obj2.lightload;
            System.out.println("Light on");}
        if(obj2.sum>2000)
            System.out.println("Overload");


    }

}