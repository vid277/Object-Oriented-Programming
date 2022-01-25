//Import statements
import java.util.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

/**
 * Reads and stores these names. Contains the functions for running the code. 
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (11/18/2021)
 */

public class Names
{
    //Declare the variables
    private Scanner scan;
    private File file;
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> nameslower = new ArrayList<String>();
    ArrayList<ArrayList> decade = new ArrayList<ArrayList>();
    ArrayList<int[]> deca = new ArrayList<int[]>();
    
    //The constructor.
    //Adds names and decades to a larger list
    public Names()
    {
         try{
            File file = new File ("names.txt");  
            Scanner scan = new Scanner(file);
                   
            String line;
             
            while(scan.hasNextLine()){
                line = scan.nextLine();
                NameRecord obj = new NameRecord(line);
                names.add(obj.getName());
                nameslower.add(obj.getName().toLowerCase());
                decade.add(obj.getData());
                deca.add(obj.getList());
            }
         }
         catch(Exception e){
             System.out.println("Error");
         }
         //System.out.println(names);
    }
    
    //Checks which names are becoming more popular over time
    public String popular(){
            ArrayList <int[]> val = new ArrayList<int[]>();
            ArrayList <String> name = new ArrayList<String>();
            int a = 0;
            int b = 0;
            for (int[] outer : deca){
                boolean torf = false;
                for (int i = 0; i < outer.length-1; i++){
                    a = outer[i];
                    b = outer[i+1];
                    int popcount = 0;
                    int popneg = 0;
                    if (a == 0 || b == 0){
                        i++;
                        torf = false;
                        break;
                    }
                    else{
                        if (a - b > 0){
                            torf = true;
                        }
                        else{
                            torf = false;
                            break;
                        }
                    }
                }
                if (torf == true){
                    val.add(outer);
                }
            }
            //System.out.println(Arrays.deepToString(val.toArray()));
            for (Object name1 : val){
                name.add(names.get(deca.indexOf(name1)));
            }
            //System.out.println(((Arrays.deepToString(name.toArray())).replace("[","")).replace("]",""));
            return (((Arrays.deepToString(name.toArray())).replace("[","")).replace("]",""));
    }
    
    //Checks the highest rank for a given name
    public String highestrank(String givname){
        ArrayList<Integer> declist = new ArrayList<Integer>();
        int[] decl = new int[11];
        declist = decade.get(nameslower.indexOf(givname.toLowerCase()));
        for (int i = 0; i < 11; i++){
            decl[i] = declist.get(i);
        }
        for (int outer : declist){
            int num[] = new int [11];
            int temp;
            for (int i = 0; i < 11; i++){
                for (int j = 0; j < 11; j++){
                    if (decl[i] == 0){
                        decl[i] = 1000;
                    }
                    else if (decl[j] == 0){
                        decl[j] = 1000;
                    }
                    else if (decl[i] < decl[j]){
                        temp = decl[i];
                        decl[i] = decl[j];
                        decl[j] = temp;
                    }
                }        
            }
            //System.out.println(Arrays.toString(decl));
        }
        //System.out.printf("Highest name popularity rank for %s is %d%n", givname, decl[0]);
        return (""+decl[0]);
    }
    
    //Names that are ranked in all year
    public String rankall(){
        ArrayList <int[]> decsno0 = new ArrayList<int[]>();
        ArrayList <String> namefind = new ArrayList<String>();
    
        for (int[] outer : deca){
            boolean torf = true;
            for (int i = 0; i < 11; i++){
                if (outer[i] == 0){
                    torf = false;
                }
            }
            if (torf == true){
                decsno0.add(outer);
            }
        }
        for (Object name1 : decsno0){
            namefind.add(names.get(deca.indexOf(name1)));
        }
        //System.out.println(Arrays.deepToString(namefind.toArray()));
        return (((Arrays.deepToString(namefind.toArray())).replace("[","")).replace("5",""));
    }
    
    //Names that are only ranked in one year
    public String appearone(){
        ArrayList <int[]> decsnonum = new ArrayList<int[]>();
        ArrayList <String> namefind = new ArrayList<String>();
        for (int[] outer : deca){
            int numover = 0;
            for (int i = 0; i < 11; i++){
                if (outer[i] != 0){
                    numover++;
                }
            }
            if (numover == 1){
                decsnonum.add(outer);
            }
        }
        for (Object name1 : decsnonum){
            namefind.add(names.get(deca.indexOf(name1)));
        }
        //System.out.println(Arrays.deepToString(namefind.toArray()));
        return (((Arrays.deepToString(namefind.toArray())).replace("[","")).replace("]",""));
    }
    
    //Finds the ranks for a given name
    public String findrank(int num){
        int rank = num;
        ArrayList <int[]> findrank = new ArrayList<int[]>();
        ArrayList <String> namefind = new ArrayList<String>();
        
        try{
            
            for (int[] outer : deca){
                int numover = 0;
                for (int i = 0; i < 11; i++){
                    if (rank == outer[i]){
                        findrank.add(outer);
                        break;
                    }
                }
            }
            
            for (Object name1 : findrank){
                namefind.add(names.get(deca.indexOf(name1)));
            }
            
            //System.out.println(((Arrays.deepToString(namefind.toArray())).replace("[","")).replace("]",""));
        } catch (Exception e){
            System.out.println("Input a string");
        }
        if (findrank.size() == 0){
            namefind.add("Name Not Found");
        }
        return (((Arrays.deepToString(namefind.toArray())).replace("[","")).replace("]",""));
    }
    
    //Finds the ranks for a given
    public ArrayList search (String name){
        Iterator iter = nameslower.iterator();
        int count = 0;
        
        ArrayList <Integer> temp = new ArrayList<Integer>();
        ArrayList <String> name1 = new ArrayList<String>();
        
        try{
            while (iter.hasNext()) {
                 if((iter.next().equals(name.toLowerCase()))){
                    temp = decade.get(count);
                 }
                 count++; 
            }
        }
        catch(Exception e){
            System.out.println("Error with search");
        }
        if (temp.size() == 0){
            name1.add("Name Not Found");
            return name1;
        }
        return temp;
    }   
    
    //Returns the array that contains the rank for each given name
    public int[] plot (String name){
        Iterator iter = nameslower.iterator();
        int count = 0;
        int[] temp = new int[12];
        try{
            while (iter.hasNext()) {
                 if((iter.next().equals(name.toLowerCase()))){
                    temp = deca.get(count);
                 }
                 count++; 
            }
        }
        catch(Exception e){
            System.out.println("Error with search");
        }
        Graph plot = new Graph(name, temp);
        return temp;
    }
}
