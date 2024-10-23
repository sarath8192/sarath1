interface Eatable {
    void eat();
}

interface Flyable {
    void fly();
}

class Bird implements Eatable, Flyable {
    public void eat() {
        System.out.println("Bird is eating");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

class MultipleDemo {
    public static void main(String args[]) {
        Bird b = new Bird();
        b.eat();
        b.fly();
    }
}
