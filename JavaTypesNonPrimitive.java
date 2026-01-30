public class JavaTypesNonPrimitive {
    public static void main(String[] args) {
        //Non_Primitive Types
        String name = "GautamArora"; //long characters we use string
        System.out.println(name.length());
     }
}


// Concatenate ............................................................

class Concatenate {
     public static void main(String[]args) {
         String name1 = "Gautam ";
         String name2 = " Arora";
         String name3 = name1 + "and" + name2;

         System.out.println(name3);
     }
}

//  CharAt
class charAt {
    public static void main(String[] args) {

        String name = "Gautam";

        System.out.println(name.charAt(0));
        System.out.println(name.length());
    }
}
