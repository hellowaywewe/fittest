import a.PersonA;
import a.PersonB;

public class SayHello {
    public static void main(String[] args){
        PersonA personA = new PersonA("A", 18);
        System.out.println("Hello, I am " + personA.getName());
        System.out.println(100 + 200);
        PersonB personB = new PersonB("B", 20);
        System.out.println("Hello, I am " + personB.getName());
    }
}
