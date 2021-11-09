/* Import Statement
    2 Default package:- java.lang package and current working directory.
    2 types of Import Statement:-
    import java.lang.*; Implicitly import
    import java.util.scanner; Explicitly import
    first preference goes to Explicitly import statement
    second preference goes tp current working directory
    last preference goes to implicitly import....i.e. *
    Total 14 package are there in java

    import java.* ---> illegal (It will import all classes of java folder

    packages reduces the conflicts b/w names

    if you want to use only static attributes of a class than we use "static import statement"
    ex---> import static java.lang.Integer.MAX_VALUE;
    Here preferences are different--->
    First-- Current working directory static attribute
    second--- Explicitly import
    third-- Implicitly import

    Example-------------------------->
    import static java.lang.Integer.MAX_VALUE;
public class LAB_01 {
    public static void main(String[] args) {
        System.out.println(MAX_VALUE);
    }
}

    Final------------------------------------------>
    It is a modifier
    if you want to impose restriction, use final modifier
    you can use this with variable, method, class.
    jvm will not provide the default value of final variable

    Abstract Modifier and Final Modifier can be used jointly....It is illegal
    we can't use private and abstract jointly....it is also illegal

*/

public class LAB_01 {
    public static void main(String[] args) {
        final A obj = new A();
        obj.a=78;
        obj.b=79;
        obj.show();

        A obj1=new A();
      //  final A obj7 = new A();
      //   obj7 = obj1;  //cant do this

        A obj2=new A();
        A obj3=obj2; // It will not invoke the constructor while you initialize it.
        System.out.println(obj2);
        System.out.println(obj3);
        obj2.a=9090;
        System.out.println(obj3.a); //here reference is same fot both obj---> obj2 and obj3
    }
}
class A{
    public int a;
    public int b;
    A(){
        a=50_000;
        b=1_45_000;
    }
    public void show(){
        System.out.println(a);
        System.out.println(b);
    }
  //  public void name
}