package assistedPracticeProject2;

class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
class Male extends Human {
    public Male(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Person with name " + name + " and age " +age+ " speaks.");
    }
}


public class OopsPillers {
    public static void main(String[] args) {
        Human action = new Human("Human", 23);
        Male m = new Male("Sandy", 22);
        action.eat();
        action.sleep();
        action.makeSound();
        m.makeSound();
    }
}