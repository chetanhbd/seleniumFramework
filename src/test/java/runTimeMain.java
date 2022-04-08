public class runTimeMain {

    public static void main(String[] args){
        runTimeParent p1;
        //new memory allocate
        p1=new runTimeChild1();
        p1.print();
        p1=new runTimeChild2();
        p1.print();
    }
}
