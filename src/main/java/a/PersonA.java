package a;

public class PersonA {
    private String name;
    private int age;

    public PersonA(String name){
        this.name = name;
    }

    public PersonA(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
