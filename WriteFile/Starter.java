import java.util.Scanner;
/**
 * This class writes to a specified file.
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (10/21/2021)
 */
public class Starter
{   
    // instance variables - replace the example below with your own
    
    public static void main(String [] args)
    {
        WriteFile write = new WriteFile(args[0]);
        Scanner scan= new Scanner(System.in);
        String s;
        s = new String("");
        for (int i = 0; i < 20; i++){
            System.out.println("Print a string --> ");
            s = scan.nextLine();
            write.write(s);
        }
        write.close();
    }

}
