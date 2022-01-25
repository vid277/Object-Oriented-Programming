import java.io.FileNotFoundException;

/**
 * This class starts the read file.
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (10/18/2021)
 */
public class Start
{
    public static void main(String[] args) throws FileNotFoundException{
        new ReadFile(args[0]);
    }
}
