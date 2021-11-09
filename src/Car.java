import java.util.Arrays;

public class Car {
    String Manufacturer;
    int price;

    Car(String Manf, int prc){
        Manufacturer=Manf;
        price=prc;
    }

    public void display(){
        System.out.println(Manufacturer + " " + price);
    }
}
class CarMAin{
    public static void main(String[] args) {
        Car obj1 = new Car("Audi",5000000);
        Car obj2 = new Car("BMW", 4000000);
        Car obj3 = new Car("Ertiga", 1000000);

        int[] arr = {obj1.price,obj2.price,obj3.price};
     //   Arrays.stream(arr).sorted();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0; i< arr.length; i++){
            if(obj1.price==arr[i])
                obj1.display();
            else if(obj2.price==arr[i])
                obj2.display();
            else
                obj3.display();
        }
    }


}