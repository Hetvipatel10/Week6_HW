package java_mid6_hw;

public class Pro6_replace {
    //Write a java program which replace a “I@love@java” to “we love java”
    //Expected output: We love java

    public static void main(String[] args) {

        String name= "I@love@java";


        String replace = name.replace("I@love@java","we love java");
        System.out.println(replace);
    }
}
