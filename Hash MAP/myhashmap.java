import java.util.HashMap;
/**
 * Write a description of class myhashmap here.
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (11/11/2021)
 */
public class myhashmap
{
    private HashMap<String, String>phonebook;//Declares the Hash map
    public myhashmap()
    {
        phonebook = new HashMap<String,String>();//Creates an empty HashMap
        phonebook.put("John", "773-890-2323");
        phonebook.put("Jose", "773-890-8900");
        phonebook.put("Jack", "773-890-2340");
        phonebook.put("Jim", "773-890-3452");
        System.out.println(phonebook.get("Jose"));
    }
}
