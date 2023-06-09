package Person;

public class Main {
    public static void main(String[] args){
        System.out.println("Hi!");
        Female Natali = new Female("Natali", "Buzok", 16);
        Male George = new Male("George", "Miller", 28);
        Male Paul = new Male("Paul", "Stanly", 33);
        Paul.setInfertile();
        System.out.printf("%s %s and %s %s got merried! ", Natali.getFirstName(), Natali.getLastName(), George.getFirstName(), George.getLastName());
        Natali.setPartner(George);
        Natali.registerPartnership(Paul);
        System.out.printf("%s met %s at girls party. They feel stong magnetism. ;)\n", Natali.getFirstName(), Paul.getFirstName());
        Natali.makePregnant(Paul);
        Natali.makePregnant(George);
        System.out.printf("%s got know about %s adultery. They had a fight. %s want a divorce.\n", George.getFirstName(), Natali.getFirstName(), Natali.getFirstName());
        Natali.deregisterPartnership(George);
        if (Natali.getPregnancy())
            System.out.print("But Natali feel sick. This because she's pregnant\n");
    }
}
