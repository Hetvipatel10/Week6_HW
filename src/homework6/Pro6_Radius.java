package homework6;

public class Pro6_Radius {
    //Write a program to enter any radius value of the circle and find out the
    //area.(Formula of Area A=PI*r*r).

    private static final double radius = 7.5;

    public static void main(String[] args) {

        double perimeter = 2* Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " +perimeter);
        System.out.println("Area is =" +area);
    }
}
