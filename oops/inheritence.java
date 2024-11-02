class Shape{
//    String color;
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTraingle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

public class inheritence {
    public static void main(String args[]){
        Triangle t1 = new Triangle();

    }
}
