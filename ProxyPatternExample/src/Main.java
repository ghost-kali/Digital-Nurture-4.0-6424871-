//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("Image1 - First Call:");
        image1.display();

        System.out.println("\nImage1 - Second Call:");
        image1.display();

        System.out.println("\nImage2 - First Call:");
        image2.display();
}
}