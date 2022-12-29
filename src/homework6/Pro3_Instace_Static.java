package homework6;

public class Pro3_Instace_Static {

    //3. Write a Java programme using the following steps.
    //3.1 Declare one instance and one static variable.
    //3.2 Declare one instance method.
    //3.3 Declare one static method.
    //
    //3.4 Call both instance and static variables i
    //nto both instance and static methods inside the print statement.
    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.


    String name = "Hetvi";//instance variable

    String name1 = "sky";
    static String surname = "Patel";//static variable

    static String surname1 = "Shah";

    public static void main(String[] args) { //main method
         Pro3_Instace_Static p= new Pro3_Instace_Static(); //object created
         p.m1();//instance access via object
         m2();//direct access
    }

    public void m1(){ //main method
        System.out.println(name1);//instance variable  called in print line
        System.out.println(surname1);//instance variable  called in print line

    }

    public static void m2() {//main method
        Pro3_Instace_Static p= new Pro3_Instace_Static();
        System.out.println(p.name);//calling static variable in print statement
        System.out.println(surname);//calling static variable in print statement
    }



}
