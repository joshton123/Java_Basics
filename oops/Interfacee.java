interface AAnimal{
    void walk();
}

class hoo implements  AAnimal{
    public void  walk(){
        System.out.println("It walks");
    }
}
public class Interfacee {
    public static void main(String args[]){
        hoo h1 = new hoo();
        h1.walk();
    }
}
