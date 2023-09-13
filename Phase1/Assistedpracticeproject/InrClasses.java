package assistedPracticeProject1;

public class InrClasses {
    private int outerValue = 15;
    
    public class Inner {
        public void displayInner() {
            System.out.println("Inner class method called");
            System.out.println("Value from inner class: " + outerValue);
        }
    }
    public static void main(String[] args) {
        InrClasses outer = new InrClasses();
        InrClasses.Inner inner = outer.new Inner();
        inner.displayInner();
        outer.outerValue = 25;
        inner.displayInner();
    }
}
