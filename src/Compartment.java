import java.util.Random;

abstract public class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment{
    public String notice(){
        return "It is a first class";
    }
}

class Ladies extends Compartment{
    public String notice(){
        return "It is a Ladies compartment";
    }
}

class General extends Compartment{
    public String notice(){
        return "It is a General class";
    }
}

class Luggage extends Compartment{
    public String notice(){
        return "It is a Luggage Compartment";
    }
}

class TestCompartment{
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random r = new Random();
        for(int i=0; i<compartments.length; i++){
            int num = r.nextInt(4) + 1;
            // it will generate random number from 0 to 3 (4 is not included) but we want from 1 to 4 that's why i added one in this.
            if(num == 1){
                compartments[i] = new FirstClass();
            }

            else if(num == 2){
                compartments[i] = new Ladies();
            }

            else if(num == 3){
                compartments[i] = new General();
            }

            else if(num == 4){
                compartments[i] = new Luggage();
            }
            System.out.println(compartments[i].notice());
        }
    }
}