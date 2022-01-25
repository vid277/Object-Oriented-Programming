import java.awt.Color;
import java.awt.*;
/**
 * This is the heater method which increases and decreases the temperature. 
 * The temperature is also visualized on the gauge to the right. 
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (10/7/21)
 */

//Class called Heater
public class Graph
{
    // Instance variables
    public Canvas myCanvas;
    private int increment; //Contains the integer value of temperature
    private String strincrement; //Stores the value of temperature as a string
    private int width;
    private int height;
    private String name;
    private int[] storedec;
    
    //Constructor to initialize the canvas
    public Graph(String name, int[] decades)
    {
        width = 515;
        height = 500;
        
        this.name = name;
        myCanvas = new Canvas("Graph of the Name Popularity for " + name, width, height);
        //drawOutline();
        
        storedec = new int[11];
        //System.out.println(decades);
        for (int i = 0; i < 11; i++){
           storedec[i] = decades[i]; 
        }
        draw();
    }
    
    //This is the outline for the basic graph
    //This lays out the x-axis and y-axis intervals
    public void draw(){
        int savei = 50;
        int savelabels = 42;
        int year = 1900;
        int pop = 1000;
        int yaxis = 425;
        myCanvas.setVisible(true);
        myCanvas.setForegroundColor(Color.RED);
        myCanvas.drawLine(0, 450, 515, 450);
        myCanvas.drawLine(50, 450, 50, 40);
        myCanvas.drawLine(0, 40, 515, 40);
        Font labels = new Font("TimesRoman", Font.BOLD, 14);
        myCanvas.setFont(labels);
        myCanvas.drawString("Graph of the name '" + name + "' through the decades", 50, 10);
        
        Font label1 = new Font("TimesRoman", Font.BOLD, 12);
        myCanvas.setFont(label1);
        for(int i = 0; i < 11; i++){
            myCanvas.drawLine(savei + 45, 450, savei + 45, 40); //x-axis
            myCanvas.drawString("" + year, savelabels, 470); //x-labels
            myCanvas.drawString("" + pop,15, yaxis); //y-labels
            //myCanvas.drawLine(50, yaxis-5, 515, yaxis-5); //vertical lines
            year = year + 10;
            savei = savei + 45;
            savelabels = savelabels + 44;
            yaxis = yaxis - 35;
            pop = pop - 100;
        }
        
        plot();
    }
    
    //This draws the graph for a given names popularity
    public void plot(){
        int xaxis = 50;
        int yaxis = 0;
        double locx = 0.0;
        double locy = 0.0;
        for (int i = 1; i < 12; i++){
            //System.out.println(storedec[i]);
            double pos[] =  new double[2];
            
            int prevx = 80;
            int prevy = 450;
            
            if (storedec[i-1] == 0 || ""+storedec[i-1] == ""){
                myCanvas.drawString("NR", xaxis, 30);
                xaxis += 44;
            }
            else {
                prevx = xaxis-44;
                
                if (i>=2){
                    if (storedec[i-2] != 0){
                        prevy = (int)(storedec[i-2]*0.35+75);   
                    }
                    else{
                        prevy = 450;
                    }
                }
                
                myCanvas.fillRectangle(xaxis+4, (int)(storedec[i-1]*0.35+74), 6, 6);
                myCanvas.drawString(name.toUpperCase(), xaxis+12, (int)(storedec[i-1]*0.35+60));
                if (storedec.length>=2){
                    myCanvas.drawLine((int)prevx, (int)prevy,(int)xaxis, (int)(storedec[i-1]*0.35   +75));
                }
                xaxis = xaxis + 44;
            } 
            }
        }
    }