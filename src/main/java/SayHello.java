import a.PersonA;
import b.PersonB;


public class SayHello {
    public static void main(String[] args){
        PersonA personA = new PersonA("A");
        System.out.println("Hello, I am " + personA.getName());
        PersonB personB = new PersonB("B");
        System.out.println("Hello, I am " + personB.getName());
    }
}
