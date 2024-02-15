public class Rectangle {
    // instance variables
    double height;
    double width;

    // Non parameterized constructor
    Rectangle() {

    }

    // Parameterized constructor
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double getArea() {
        return height * width;
    }

    void printAll() {
        System.out.println("Height is: " + height);
        System.out.println("Width is: " + width);
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(10.5, 4);
        rec1.printAll();
        double area1 = rec1.getArea();

        Rectangle rec2 = new Rectangle(5, 10);
        rec2.printAll();
        double area2 = rec2.getArea();

        System.out.println(area1 + "   " + area2);

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(4, 5);
        rectangles[1] = new Rectangle(5, 5);
        rectangles[2] = new Rectangle(5, 10);

        System.out.println("-----");

        for (Rectangle rec : rectangles) {
            System.out.println(rec.getArea());
        }

        /*
         * Task: Create a class called Box.
         * Declare appropriate instance variables.
         * Also add a parameterized constructor to the Box class,
         * then create 2 objects by calling the constructor.
         * 
         * 
         * Add a method called getVolume. Create an array of Boxes,
         * call the getVolume method
         * on each object and print the volume in the console.
         */
    }
}