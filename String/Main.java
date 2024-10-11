
class Person {

    String name;
    String occupation;

    public Person(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Occupation: " + occupation);
    }


    public String describeOccupation() {
        return name + " works as a " + occupation + ".";
    }
}

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Alice", "Software Developer");
        Person person2 = new Person("Bob", "Graphic Designer");

        person1.displayInfo();
        System.out.println(person1.describeOccupation());
        
        System.out.println();

        person2.displayInfo();
        System.out.println(person2.describeOccupation());
    }
}
