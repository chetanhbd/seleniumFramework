import java.io.*;

public class fileRead {

    public static void main(String[] args) throws IOException {
        File file=new File("D:\\jj.txt"); //   (   users/Documents/jj.txt  )

        BufferedReader br=new BufferedReader(new FileReader(file));

        String st;

        while((st=br.readLine())!=null){
            System.out.println(st);
        }
    }
}
