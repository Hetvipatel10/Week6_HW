package homework6;

public class Pro2_Static { //declare class

    //2. Write a Java programme using the following steps.
    //2.1 Declare two static variables
    //2.2 Declare one static method
    //2.3 Call both static variables into the static method inside the print
    //statement. 2.4 Declare the Main method.
    //2.5 Call the static method into the Main method and Run the programme.

    static int age;//static v1
    static String name;//static v2

    static void disp(){ //static method
        System.out.println("Age is :"+age);//calling static variable in print statement
        System.out.println("Name is:"+name);//calling static variable in print statement

    }

    public static void main(String[] args) { //main method
        age =20;//assign v1
        name="hetvi";//assign v2
        disp();//calling static method
    }

}
