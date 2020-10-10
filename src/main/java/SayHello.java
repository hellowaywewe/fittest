import a.PersonA;
import a.PersonB;
import a.PersonC;

public class SayHello {
    public static void main(String[] args){
        PersonA personA = new PersonA("A");
        System.out.println("Hello, I am " + personA.getName());
        PersonB personB = new PersonB("B");
        System.out.println("Hello, I am " + personB.getName());
        PersonC personC = new PersonC("C", 22);
        System.out.println("Hello, I am " + personC.getName());
        System.out.println("I am " + personC.getAge()+ "years old");
    }
}
