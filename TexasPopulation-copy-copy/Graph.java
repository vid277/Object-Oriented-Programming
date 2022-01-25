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
public class Graph
{
    // Instance variables
    public Canvas myCanvas;
    private int increment; //Contains the integer value of temperature
    private String strincrement; //Stores the value of temperature as a string
    private int width;
    private int height;
    private int plotW;
    private int plotH;
    private int xaxis;
    private int yaxis;
    public Graph(int w, int h)
    {
        width = w;
        height = h;
        plotW = (int)(width*0.8);
        plotH = (int)(height*0.1);
        xaxis = (int)(width*.1);
        yaxis = (int)(height*.9);
        myCanvas = new Canvas("Number of Counties Corresponding to Leading Digit", width, height);
        drawOutline();
    }

    //The showHeater method is used to display the heater, gauge, and other values.
    public void drawOutline()
    {
        myCanvas.setVisible(true);
        myCanvas.drawLine(xaxis, yaxis, plotW, yaxis);
        myCanvas.drawLine(xaxis, plotH, xaxis, yaxis);
        myCanvas.drawLine(xaxis, yaxis, xaxis, yaxis + height/50);
        myCanvas.drawLine(xaxis + width/50, plotH, xaxis - width/50, plotH);
        int num = 100;
        for (int i = 2;i<11;i++){
           myCanvas.drawLine(plotW*i/11,yaxis+height/70,plotW*i/11,yaxis-height/70);
           myCanvas.drawString(String.valueOf(i-1), plotW*i/11, yaxis+height/20);
        }
        for (int i = 0; i<11; i++){
           myCanvas.drawLine(xaxis + width/70, yaxis * i/10, xaxis-width/70, yaxis*i/10);
           myCanvas.drawString((Integer.toString(num)), xaxis-width/17, yaxis*i/10);
           num= num-10; 
        }
        myCanvas.setForegroundColor(Color.red);
        myCanvas.fillRectangle(xaxis, yaxis-360, 39, 360); //Bar 1
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.fillRectangle(xaxis+45, yaxis-175, 30, 175); //Bar 2
        myCanvas.setForegroundColor(Color.orange);
        myCanvas.fillRectangle(xaxis+80, yaxis-190, 30, 190); //Bar 3
        myCanvas.setForegroundColor(Color.yellow);
        myCanvas.fillRectangle(xaxis+117, yaxis-120, 30, 120); //Bar 4
        myCanvas.setForegroundColor(Color.lightGray);
        myCanvas.fillRectangle(xaxis+153, yaxis-75, 30, 75); //Bar 5
        myCanvas.setForegroundColor(Color.magenta);
        myCanvas.fillRectangle(xaxis+188, yaxis-75, 30, 75); //Bar 6
        myCanvas.setForegroundColor(Color.green);
        myCanvas.fillRectangle(xaxis+225, yaxis-85, 30, 85); //Bar 7
        myCanvas.setForegroundColor(Color.cyan);
        myCanvas.fillRectangle(xaxis+262, yaxis-60, 30, 60); //Bar 8
        myCanvas.setForegroundColor(Color.pink);
        myCanvas.fillRectangle(xaxis+298, yaxis-40, 30, 40); //Bar 8
        myCanvas.setForegroundColor(Color.BLACK);
        myCanvas.drawString("Number of Counties Corresponding to Each Leading Digit", 85, 50);
        myCanvas.drawString("Number", 7, 240);
        myCanvas.drawString("of", 7, 250);
        myCanvas.drawString("Counties", 7, 260);
        myCanvas.drawString("Leading Digits", 180, 490);
    }
}
