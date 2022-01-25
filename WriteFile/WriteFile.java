import java.io.*;

/**
 * This class writes text to a file.
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (10/210/2021)
 */
public class WriteFile
{
    // instance variables - replace the example below with your own
    private FileOutputStream out;
    private PrintStream ps;

    //The name of the file would be the input
    public WriteFile(String s)
    {
        try
        {
            out = new FileOutputStream(s);
            ps = new PrintStream(out);
        }
        catch (Exception e)
        {
            System.out.println("Error Opening the File: " + s);
        }   
    }
    public void write(String s)
    {
        try {
            ps.println(s);   
        }
        catch(Exception e){
            System.out.println("Error writing to the file");
        }
    }
    public void close(){
        try{
            ps.close();
        }
        catch(Exception e){
            System.out.println("Error while cloning this file");
        }
    }
    
}
