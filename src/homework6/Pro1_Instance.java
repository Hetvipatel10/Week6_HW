package homework6;

public class Pro1_Instance {
    //1. Write a Java programme using the following steps.
    //1.1 Declare two instance variables.
    //1.2 Declare one instance method.
    //1.3 Call both instance variables into the instance method inside the print
    //statement. 1.4 Declare the Main method.
    //1.5 Call the above instance method into the Main method and Run the programme.

    String name = "Hetvi";// instance v1 1.1
    String surname= "Patel";//instance v2 1.1

    public static void main(String[] args) { //main method 1.4

        Pro1_Instance t =new Pro1_Instance ();// create object of instance method 1.4
        t.m1();//calling instance method 1.5

    }
    //instance method 1.2
    public  void m1(){
        System.out.println(name);//instance variable  called in print line 1.3
        System.out.println(surname);//instance variable  called in print line 1.3

    }


}
