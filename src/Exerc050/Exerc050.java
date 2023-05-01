package Exerc051;

class Arithmetic {
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }
}

class Adder extends Arithmetic {

}

public class Exerc051 {

    public static void main(String[] args) {
        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        System.out.println(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}
