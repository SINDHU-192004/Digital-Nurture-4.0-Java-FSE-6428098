// Main.java
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        System.out.println("First display:");
        image.display();

        System.out.println("Second display:");
        image.display();
    }
}
