package homework6;

public class Pro14_Rectangle {
    //Write a Java program to print the area and perimeter of a rectangle.
    //
    //Test Data:
    //Width = 5.5 Height = 8.5
    public static void main(String[] args) {

        final double width = 5.5;
        final double height= 8.5;

        double perimeter = 2*(height + width);
        double area = width * height;

        System.out.printf("Area is" + area);
        System.out.printf("Perimeter is" + perimeter);


    }

}
