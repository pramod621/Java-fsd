package accessModifiers;

public class accessmodifier {
	public static void main(String[] args) {
        MyClass am = new MyClass();
        am.publicMethod();    
        am.defaultMethod();   
        // Private method is not accessible outside the class
        am.protectedMethod(); 
    }
}

class MyClass {
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}