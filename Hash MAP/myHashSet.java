import java.util.HashSet; //import Statement 
/**
 * This class implementes a hashset
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (a version number or a date)
 */
public class myHashSet
{
    private HashSet<String> myset;
    
    public myHashSet(){
        myset = new HashSet<String>();
        myset.add("one");
        myset.add("two");
        myset.add("three");
        myset.add("four");
        myset.add("five");
        myset.add("six");
        
        for (String s: myset){
            System.out.println(s);
        }
    }
}
