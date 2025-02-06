public class Test implements Testable {
    //Implementing the display() method from the Testable interface
    public void display() {
        System.out.println("Displaying from the Test class");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}
