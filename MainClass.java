package Polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        Pet p =d;
        Animal a =d;

        d.walk();
        p.walk();
        /**
         * The output here will be Dog is walking in both cases
         * This is because each time walk() from the Dog class is called
         * but we can't know during compile time which method is going to call
         * This is also known as Dynamic
         */
    }

}
