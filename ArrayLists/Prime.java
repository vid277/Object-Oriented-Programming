import java.util.ArrayList; 

/**
 * Write a description of class Prime here.
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (11/8/2021)
 */

public class Prime
{
    // instance variables - replace the example below with your own
    ArrayList<String> prnum = new ArrayList<String>();

    /**
     * Constructor for objects of class Prime
     */
    public Prime()
    {
        for (int i = 0; i < 10000001; i++){
            prnum.add("true");
            if ((i) % 2 == 0){
                prnum.set(i, "false");
            }
            else if((i) % 3 == 0){
                prnum.set(i, "false");
            }
            else if(i>10){
                if (((i) % 7 == 0)||((i) % 5 == 0)){
                    prnum.set(i, "false");
                }
            }
            //System.out.println(prnum + " " +i);
        }
        print();
    }

    public void print()
    {
        for (int x = 10000000; x > -1; x--){
            if (prnum.get(x) == "true"){
                System.out.println("The largest prime number is: " + x);
                break;
            }
        }
    }
}
