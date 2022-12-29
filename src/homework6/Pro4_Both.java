package homework6;

public class Pro4_Both { //declare class

    //4. Write a Java programme using the following steps.
    //4.1 Declare two instance and two static variables.
    //4.2 Declare one instance method.
    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    //print statement.
    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.

    String book = "Love";//instance v1
    String color= "Red";//instance v2

    static String city = "Uk";//static v1
    static int num=10;//static v2

    public static void main(String[] args) { //main method
        Pro4_Both p=new Pro4_Both(); //object created
        p.m1();//instance access via object
        m2();//direct access
    }
    public void m1(){//main method
        System.out.println(book);//instance variable  called in print line
        System.out.println(color);//instance variable  called in print line
    }

    public static void m2(){//main method
      Pro4_Both p= new Pro4_Both();
        System.out.println(city);//calling static variable in print statement
        System.out.println(num);//calling static variable in print statement
        System.out.println(p.book);
        System.out.println(p.color);
    }

}
