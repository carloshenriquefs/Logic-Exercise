package Exerc055;


class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        BiCycle bicycle = new BiCycle();
        System.out.println("Hello I am a motorcycle, I am " + define_me());

        String temp = bicycle.define_me();

        System.out.println("My ancestor is a cycle who is " + temp);
    }
}

public class Exerc055 {
    public static void main(String[] args) {
        MotorCycle m = new MotorCycle();
    }
}
