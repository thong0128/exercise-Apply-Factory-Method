package view;
import manager.*;
import java.util.Scanner;

public class FactoryPatternDemo {
    public static int intInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("Menu");
            System.out.println("1.Draw Circle");
            System.out.println("2.Draw Square");
            System.out.println("3.Draw Rectangle");
            System.out.println("0.Exit");
            System.out.println("Enter shape type: ");
            int choice = intInput();
            ShapeType shapeType = null;
            switch (choice) {
                case 1:
                    shapeType = ShapeType.CIRCLE;
                    break;
                case 2:
                    shapeType = ShapeType.SQUARE;
                    break;
                case 3:
                    shapeType = ShapeType.RECTANGLE;
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }
            try {
                ShapeFactory.getShape(shapeType).draw();
            } catch (NullPointerException e) {
                System.out.println("Please input again");
            }
        }
    }
}
