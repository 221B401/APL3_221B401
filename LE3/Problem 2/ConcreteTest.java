public class ConcreteTest extends AbsTest {
    public void display() {
        System.out.println("Displaying from ConcreteTest class");
    }

    public static void main(String[] args) {
        ConcreteTest test = new ConcreteTest();
        test.display();
    }
}
