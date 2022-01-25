import java.util.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import javax.swing.*;
import java.awt.event.*;

/**
 * Reads and stores these names.
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (11/18/2021)
 */

public class NameRecord 
{
    private ArrayList<Integer> decades = new ArrayList<Integer>();
    private int[] dec = new int[11];
    private String name;
    
    /*Pass an arguement with the line
       Split a line by spaces 
       Each word is added to a list 
       Each of the names that correspond to each name is added a list
    */
    public NameRecord(String ln)
    {
            String list[] = ln.split(" ");
            name = list[0];
            for(int i = 1; i < list.length; i++){
              decades.add(Integer.parseInt(list[i])); 
              dec[i-1] = Integer.parseInt(list[i]);
            }
    }
    
    //The list that contain the names and decades are returned
    public String getName(){
        return name;
    }
    
    public ArrayList getData(){
        return decades;
    }
    
    public int[] getList(){
        return dec;
    }
}
