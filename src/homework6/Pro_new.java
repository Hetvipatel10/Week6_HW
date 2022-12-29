package homework6;

public class Pro_new {
    String name = "Hetvi";

    static String surname ="Patel";

    public static void main(String[] args) {
        Pro_new t = new Pro_new();
        t.m1();
        m2();
    }

        public void m1(){
        System.out.println(name);
        System.out.println(surname);


    }
    public static void m2() {
        Pro_new t =new Pro_new();
        System.out.println(t.name);
        System.out.println(surname);
    }



}
