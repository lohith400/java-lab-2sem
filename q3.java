public class q3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Caw w = new Caw();
        Lion l = new Lion();

        Dog x;
        x = d;
        x.sound();

        x = c;
        x.sound();

        x = w;
        x.sound();

        x = l;
        x.sound();

    }

}

class Dog {
    void sound() {
        System.out.println("barks");
    }
}

class Cat extends Dog {
    void sound() {
        System.out.println("Meows");
    }
}

class Caw extends Dog {
    void sound() {
        System.out.println("Mooos");
    }
}

class Lion extends Dog {
    void sound() {
        System.out.println("Roars");
    }
}
