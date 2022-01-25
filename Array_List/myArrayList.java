import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This program implements arraylist
 * 
 * @author (Vidyoot Senthilvenkatesh)
 * @version (10/25/2021)
 */
public class myArrayList
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class myArrayList
     */
    public static void main(String[] args){
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1= new ArrayList<String>();
        String a = "";
        for (int i = 0; i < 5; i++){
            System.out.println("Input a string --> ");
            a = scan.nextLine();
            list1.add(a); //add the input string to array list
        }
        /**
        for(int i = 0; i < 5; i++)
        {
            System.out.println(list1.get(i));
        }
        **/
        
        /**
        //For each loop - Use for array and arraylist loop
        for(String p : list1)
        {
            System.out.println(p);
        }
        **/
        
        //Used to delete items from an array list
        Iterator<String> it = list1.iterator();
        while(it.hasNext()){
            a = it.next();
            System.out.println(a);
        }
        }
}
}
