import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * //Finds frequency of each words
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (11/11/2021)
**/

class HashMapfreq {

    private Scanner scan;
    private HashMap<String, Integer> freq;
    //private String[] words = new String[];
    public HashMapfreq()
    {
        String temp = "";
        String line = "";
        
        try{
            Frequency();  
        }
        catch(Exception e){
            System.out.println("ERROR"); 
        }
    }

    public void Frequency() throws FileNotFoundException{
        File file1 = new File("Datafile.txt");
        Scanner scan = new Scanner(file1);
        String line = "";;
        Boolean go = true;
        Map<String, Integer> hashMap = new HashMap<>();
        while (go){
            try{
                line = ((scan.next().toLowerCase()).replaceAll("\\p{Punct}", ""));
                //System.out.println(line);
                String[] splitarr = line.split(" ");
                for (String worddef: splitarr) {
                    Integer num = hashMap.get(worddef);
                    if (num == null)
                        hashMap.put(worddef, 1);

                    else {
                        hashMap.put(worddef, num + 1);
                    }
                }
            }
            catch (Exception e){
                go = false;
            }
        }        
        System.out.println(hashMap);
    }   
}

