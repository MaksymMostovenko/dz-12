package Person;

public class Male extends Person {


    public Male(String fName, String sName, int age) {
        super(fName, sName, age);
        personGender = Gender.MALE;
        System.out.printf("his age is %d\n", this.getPersonAge());
    }
}