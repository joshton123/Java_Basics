package org.example;

public class Dev {

//    private Laptop laptop;
private Computer com;
    private int age;


    public  Dev(){

        System.out.println("Dev Constructer - 1");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("Working on this project of dev-app");
        com.compile();
    }
}
