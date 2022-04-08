public class Singleton {
    // Singleton single=new Singleton();
    private static Singleton single=null;

    public String str;

    private Singleton(){ //contructor- kab execute? -- jab singleton object banega
        str="Hello I am singleton";
    }

    public static Singleton getInstance(){ //getinstance = object -- return object of singleton
        if(single==null){
            single=new Singleton();
        }
        return single;
    }
}
