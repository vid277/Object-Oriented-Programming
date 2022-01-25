import java.awt.Color;
/**
 * Write a description of class Drawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drawing
{
    // instance variables - replace the example below with your own
    public Canvas myCanvas;
    
    /**
     * Constructor for objects of class myCanvas
     */
    public Drawing()
    {
        myCanvas = new Canvas("Temperature Gauge", 500, 500);
    }

    public void bounce()
    {
        myCanvas.setVisible(true);
        
        myCanvas.setForegroundColor(Color.BLACK);
        
        myCanvas.drawLine(100,100,400,400);
        myCanvas.fillRectangle(0,0,200,200);
        myCanvas.setForegroundColor(Color.YELLOW);
        myCanvas.fillCircle(50,50,50);
        myCanvas.setForegroundColor (Color.BLACK);
        myCanvas.drawString("Smart Students", 300, 300);
    }
}
