//Import statements
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
public class Heater
{
    // Instance variables
    public Canvas myCanvas;
    private int increment; //Contains the integer value of temperature
    private String strincrement; //Stores the value of temperature as a string
    
    /**
     * Constructor for objects of class Heater. 
     * A 500 x 500 canvas is created and the temperature is initally set to 50.
     */
    public Heater()
    {
        myCanvas = new Canvas("Temperature Gauge", 500, 500);
        increment = 50; //Temperature is set to 50
        strincrement = "50"; //Temperature is set to "50" (String)
        showHeater();
    }

    //THe showHeater method is used to display the heater, gauge, and other values.
    public void showHeater()
    {
        myCanvas.setVisible(true);
        
        myCanvas.setForegroundColor(Color.BLACK);
        myCanvas.fillRectangle(20,70,460,300);
        myCanvas.setForegroundColor(Color.WHITE);
        myCanvas.fillRectangle(40,90,420,260);
        myCanvas.setForegroundColor(Color.RED);
        
        //First circle of the temperature gauge - set to red first
        myCanvas.setForegroundColor(Color.RED);
        myCanvas.fillCircle(370,265,75);
        
        //Temperature gauge of the rectangles - set to blue first
        myCanvas.setForegroundColor(Color.BLUE);
        myCanvas.fillRectangle(389,135,40,140);
        myCanvas.fillCircle(388,115,41);
        
        //Outer border of the circles
        myCanvas.setForegroundColor(Color.BLACK);
        myCanvas.fillCircle(60,110,220);
        myCanvas.fillCircle(290,140,60);
        myCanvas.fillCircle(290,250,60);
        
        //Inner white part of the circles
        myCanvas.setForegroundColor(Color.WHITE);
        myCanvas.fillCircle(70,120,200);
        myCanvas.fillCircle(295,145,50);
        myCanvas.fillCircle(295,255,50);
        
        /**
         * Inner black circles and the markings within the increase and decrease controls
         */
        myCanvas.setForegroundColor(Color.BLACK);
        myCanvas.fillCircle(299,259,42);
        myCanvas.fillRectangle(316,300,10,11);
        myCanvas.fillCircle(299,149,42);
        myCanvas.fillRectangle(316,140,10,11);
        
        //Just for show
        //Creating a new font object
        Font labels = new Font("TimesRoman", Font.BOLD, 14);
        myCanvas.setFont(labels);
        myCanvas.drawString("Increase", 295,133);
        myCanvas.drawString("Decrease", 295,243);
        myCanvas.drawString("100", 432,137);
        myCanvas.drawString("0", 450, 310);
        
        //Creatng a new font object
        Font ss = new Font("TimesRoman", Font.BOLD, 100);
        myCanvas.setFont(ss);
        
        /**
         * Checks if the temperature is Max or Min temperature
         * Sets the position of the numbers (representing temperatures) 
         * based on the temperature.
         */
        if (strincrement.equals("MAX TEMP!!!")){
            //Creating a new font object
            Font font = new Font("TimesRoman", Font.BOLD, 25);
            myCanvas.setFont(font);
            myCanvas.drawString(strincrement,100, 230);   
        }
        else if (strincrement.equals("MIN TEMP!!!")){
            Font ftmintemp = new Font("TimesRoman", Font.BOLD, 25);
            myCanvas.setFont(ftmintemp);
            myCanvas.drawString(strincrement,100, 230);   
        } else if (increment < 100){
            myCanvas.drawString(strincrement,113, 260);
        }
        else if(increment == 10){
            myCanvas.drawString(strincrement,123, 260);
        }
        else if (increment != 10)
        {
            myCanvas.drawString(strincrement,85, 260);   
        }
        
        //Sets the temperature gauge according to the temperature
        setgauge();
    }
    
    //Changes the temperature based on the value input by the user
    public void setIncrement(int newInc){
        if (newInc <= 100){
            increment = newInc;
            strincrement = String.valueOf(increment); 
            //Used to show and update the canvas
            showHeater();    
        }
        else {
            System.out.println("Please input a valid value");
        }
    }
    
    //Changes the temperature gauge based on the temperature
    public void setgauge(){
        //Makes sure that the temperature gauge is all blue for temperatures below 30
        if (increment <= 30){
            myCanvas.setForegroundColor(Color.BLUE);
            myCanvas.fillCircle(370,265,75);
            myCanvas.setForegroundColor(Color.BLUE);
            myCanvas.fillRectangle(389,135,40,140);
            myCanvas.fillCircle(388,115,41);
        }
        //Makes sure that the temperature gauge is at a certain hight and positon for 40
        else if (increment == 40){
            myCanvas.setForegroundColor(Color.RED);
            myCanvas.fillCircle(370,265,75);
            myCanvas.fillRectangle(389,260,40,30);
        }
        //Makes sure that the temperature gauge is at a certain hight and positon for 50
        else if (increment == 50){
            myCanvas.setForegroundColor(Color.RED);
            myCanvas.fillCircle(370,265,75);
            myCanvas.fillRectangle(389,220,40,60);
        }
        else if (increment <= 60){
            myCanvas.setForegroundColor(Color.RED);
            myCanvas.fillRectangle(389,(200),40,90); 
        }
        
        //Sets the canvas to all red if the temp is max
        else if (strincrement.equals("MAX TEMP!!!")){
            myCanvas.setForegroundColor(Color.RED);
            myCanvas.fillRectangle(389,135,40,140);
            myCanvas.fillCircle(370,265,75);
            myCanvas.fillCircle(388,115,41);
        }
        
        //Sets the canvas to all blue if the temp is min
        else if (strincrement.equals("MIN TEMP!!!")){
            myCanvas.setForegroundColor(Color.BLUE);
            myCanvas.fillRectangle(389,135,40,140);
            myCanvas.fillCircle(370,265,75);
            myCanvas.fillCircle(388,115,41);
        }
        //Changes the temperature gauge based on the temperature
        else {
            //System.out.println(increment);
            myCanvas.setForegroundColor(Color.BLUE);
            myCanvas.fillRectangle(389,135,40,140);
            myCanvas.setForegroundColor(Color.RED);
            myCanvas.fillRectangle(389,((280-increment)-45),40,(increment+45));
        }
    }
    
    //Increases the temperature by 10 degrees
    public void makeWarmer()
    {
        if (increment <= 90){
            increment = increment + 10;
            strincrement = String.valueOf(increment);
            showHeater();
        }
        else{
            strincrement = "MAX TEMP!!!";
            showHeater();
            System.out.println("TOO WARM - MAX TEMPERATURE REACHED");  
        }
    }
    
    //Decrease the temperature by 10 degrees
    public void makeCooler()
    {
        if (increment >= 20){
            increment = increment - 10;
            strincrement = String.valueOf(increment);
            showHeater();
        }
        else
        {
            strincrement = "MIN TEMP!!!";
            showHeater();
            System.out.println("TOO COLD - MINIMUM TEMPERATURE");
        }   
    }
    
    //Returns the current temperature
    public String getTemp()
    {
       return strincrement; 
    }
}
