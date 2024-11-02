
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }

//    public void printName(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//
//    Student(String name, int age){
//        System.out.println("Constructer called");
//        this.name = name;
//        this.age = age;
//    }
//
//    // copy constructer
//        Student(Student s2){
//        this.name = s2.name;
//        this.age = s2.age;
//    }
//    Student(){
//
//    }
}

public class OOPS {
    public static void main(String args[]){
//        Pen pen1 = new Pen();
//        pen1.color = "Blue";
//        pen1.type = "Gel";
//        pen1.write();
//        pen1.printColor();

        Student s1 = new Student();
        s1.name = "hello";
        s1.age = 10;
        s1.printInfo(s1.name,s1.age);

//        Student s2 = new Student(s1);
//        s2.printName();
    }
}
