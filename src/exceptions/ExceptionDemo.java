package exceptions;

public class ExceptionDemo {
    public static void show(){
       sayHello(null);
    }

    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
