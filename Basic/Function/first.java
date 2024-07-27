class first {
    public static void main(String[] args) {
        greeting();
        greetUser();
        pattern1();
    }

    public static void greeting(){
        System.out.println("Good Morning");
    }

    public static void greetUser(){
        System.out.println("Good User");
    }

    public static void pattern1(){
        int row=0;
        while (row<5) {
            System.out.print("*");
            int i=0;
            while (i<row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }

}
