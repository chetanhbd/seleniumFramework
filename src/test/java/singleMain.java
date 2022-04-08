import java.sql.Connection;

public class singleMain {
    public static void main(String[] args){
        Singleton x=Singleton.getInstance();

        Singleton y=Singleton.getInstance();

        Singleton z=Singleton.getInstance();
        // memory ek hi point sare object because it is singleton class.

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
// prove Singleton single object memory create


    }
}
