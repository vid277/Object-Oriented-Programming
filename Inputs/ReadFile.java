import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * This class reads an input text file
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (10/18/21)
 */
public class ReadFile
{
    
    String [] s;

    /**
     * Constructor for objects of class ReadInput
     */
    public ReadFile(String a) throws FileNotFoundException
    {
        File text = new File(a);
        Scanner scan = new Scanner(text);
        String line = "";
        s = new String[4];
        int i = 0;
        while (scan.hasNextLine()){
            line = scan.nextLine();
            //System.out.println(line);
            s[i]  = line;
            i = i + 1;
        }
        int total = 0;
        String [] s1 = new String[2];
        for (int z = 0; z < s.length; z++){
            s1 = s[z].split(" ");
            total = total + Integer.parseInt(s1[1]);
        }
        System.out.println("The total is --> " + total);
        }
    }
