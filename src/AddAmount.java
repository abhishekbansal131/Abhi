public class AddAmount {
    int amount;
    AddAmount(){
        amount=50;
    }
    AddAmount(int add){
        amount=add;
    }
}
class AmountMain{
    public static void main(String[] args) {
        AddAmount obj = new AddAmount();
        AddAmount obj2 = new AddAmount(50);
        System.out.println(obj.amount + obj2.amount);
    }

}
