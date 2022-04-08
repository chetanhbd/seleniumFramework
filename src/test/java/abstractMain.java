public class abstractMain {

    public static void main(String[] args){
        shape s1=new circle("yellow",3.5);

        shape s2=new rectangle("green",12,30);

        System.out.println(s1.toString());

        System.out.println(s2.toString());

    }
}
