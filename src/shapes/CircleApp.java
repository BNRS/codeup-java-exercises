package shapes;

public class CircleApp {
    public static void main(String[] args) {
        System.out.print("Here's how many circles are created: ");
        System.out.println(Circle.getNumberOfCircles());

        Circle one = new Circle(20);
        System.out.println(Circle.getNumberOfCircles());

        Circle another = new Circle(44);
        System.out.println(Circle.getNumberOfCircles());

    }
}