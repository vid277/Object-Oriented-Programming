import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.*;
/**
 *This program processes the population of the counties in the state of Texas.
 * 
 * @author (Vidyoot Senthilvenkatesh) 
 * @version (10/28/2021)
 */
public class Population
{
    // instance variables - replace the examplpercen;e below with your own
    private Scanner sc;
    private Scanner scan;
    private String[] counties;//stores the name of the counties
    private int[] population;//stroes the population for each county
    private int[] numCon;//number of counties for each leading digit
    private double[] percen;//percent of population for each leading digit
    private double[] digitPop;//stores population for each leading digit
    private Random rand;
    private int total[];
    private int k = 0;
    /**
     * Constructor for objects of class Population
     */
    public Population()throws FileNotFoundException
    {
        //Initialize the arrays
        String s1 = "";
        counties = new String[254];
        population = new int[254];
        numCon = new int[9];
        percen = new double[9];
        digitPop = new double[9];
        populate(); 
        total = new int [254];
        findTotal();
        rand = new Random();
        Boolean b = true;
        Scanner sc = new Scanner(System.in);
        while (b) {
            /*System.out.println("1. Print the data from the file");
            System.out.println("2. Find Texas total population");   
            System.out.println("3. Randomly choose a county and display its population");   
            System.out.println("4. Find counties population with leading digit, entered by the user");   
            System.out.println("5. Find total number of counties/percentage of population with each leading digit formatted using printf");   
            s1 = sc.nextLine(); 
            /*if (s1.equals("1")){
                
            }
            else if (s1.equals("2")){
                findTotal();
            }
            else if (s1.equals("3"){
                randomCounty();
            }
            else if (s1.equals("4"){
                
            }*/
            s1 = sc.nextLine();
            if (s1.equals("yes")){
                System.out.println("Input a integer: ");
                s1 = sc.nextLine();
                try 
                { 
                    k = Integer.parseInt(s1); 
                    showLeadingDigit();
                    b = false;
                }  
                catch (NumberFormatException e)  
                { 
                    System.out.println("Not a valid integer");
                    b = false;
                }
            }
            else {
                b = false;
            }
        }
    }
    //this method reads the file and populates the arrays
    public void populate()throws FileNotFoundException
    {
        File text = new File("TexasCountyPopulation.txt");
        scan = new Scanner(text);
        String line = "";
        String[] s = new String[2];
        int i = 0;
        while (scan.hasNextLine())
        {
            line = scan.nextLine();
            //System.out.println(line);
            s = line.split("\t");   
            counties[i] = s[0];
            //System.out.println(counties[i]);
            population[i] = Integer.parseInt(s[1]);
            i++;

        }
    }

    public int findTotal (){
        int totalpop = 0;
        for (int i = 0; i < population.length; i++){
            totalpop = population[i] + totalpop;
        }
        //System.out.println("Population is: " + totalpop);
        return totalpop;
    }

    public void showLeadingDigit(){
        String tempstr = ""; 
        int temp = 0;
        String w = Integer.toString(k);
        for (int i = 0; i < population.length; i++){
            tempstr = (String.valueOf(population[i]));
            temp = population[i];
            if ((tempstr.charAt(0))== (w.charAt(0))){
                System.out.println(counties[i] + "    " + population[i]);
            }
        }
    }

    //this method samples the population of a random county
    public void randomCounty(){
        int k = rand.nextInt(254);
        System.out.println(counties[k] + " Population is " + population[k]);
    }

    public void analysis (){
        System.out.println("Digit        Number        Percentage");
        /**int percentotal;
        int num = 1;
        int[] p2 = new int[9];
        for (int x = 0; x < 9; x++){
            p2[x] = num + x;
            System.out.println(p2[x]);
        }
        for (int i = 0; x < **/
        
        String[] p1 = new String[254];
        int[] p2 = new int[9];
        for (int i =0; i < population.length; i++){
          //p1 = String.valueOf(population[i]);
          p2[i] = i;
          for (int x =0; x < population.length; x++){
            
          }  
        }
    }
}