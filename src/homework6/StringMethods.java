package homework6;

public class StringMethods {
    public static void main(String[] args) {
        String name = "    CBustodeer";
        String name1 = "HELLO WORLD";


        System.out.println("Length of String is " +name1.length());
        System.out.println("UpperCase : " +name.toUpperCase());
        System.out.println("Lowercase : " +name1.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(name1));
        System.out.println(name.contains("HELLO"));
        System.out.println(name1.contains("Code"));
        System.out.println(name.startsWith("ster"));
        System.out.println(name1.endsWith("WORLD"));
        System.out.println(name.equals(name1));
        System.out.println(name.indexOf("Buster"));
        System.out.println(name1.isEmpty());
        System.out.println(name.isEmpty());
        System.out.println(name1.replace('L','D'));
        System.out.println(name.substring(2,4));
        System.out.println(name.substring(2));
        System.out.println(name.length());
        System.out.println(name);
        System.out.println(name.trim());
        System.out.println(name1.charAt(1));
        System.out.println(name.contains("Code"));
        System.out.println(name.substring(1));








    }
}

