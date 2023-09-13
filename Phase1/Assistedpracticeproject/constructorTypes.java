package Assistedpracticeproject;

public class constructorTypes {

	public static void main(String[] args) {
        demo data1 = new demo();  
        demo data2 = new demo("Prashant", 34); 
        data1.display();
        data2.display();
    }
}

class demo {
    private String name;
    private int age;
    
    public demo() {
        System.out.println("Default constructor.");
        name = "Surya";
        age = 24;
    }

    public demo(String name, int age) {
        System.out.println("Parameterized constructor.");
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("My Name: " + name);
        System.out.println("My Age: " + age);
    }
}