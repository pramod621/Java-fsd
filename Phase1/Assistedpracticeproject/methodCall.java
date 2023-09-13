package Assistedpracticeproject;

public class methodCall {
    static void staticMethod() {
        System.out.println("It is a static method");
    }
    void instanceMethod() {
        System.out.println("It is a instance method");
    }
    static void staticMethodWithParameters(int x, int y) {
        System.out.println("It is a static method with parameters with x = " + x + " and y = " + y);
    }
    void instanceMethodWithParameters(String str) {
        System.out.println("It is a instance method with parameters with str = " + str);
    }

    public static void main(String[] args) {
        methodCall.staticMethod();

        methodCall obj = new methodCall();
        obj.instanceMethod();

        methodCall.staticMethodWithParameters(5, 10);

        obj.instanceMethodWithParameters("My code");
    }
}