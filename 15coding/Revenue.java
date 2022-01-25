
/**
 * Calculates revenue based on unit price.
 *
 * @Vidyoot Senthilvenkatesh (your name)
 * @1 (9/10/2021)
 */
public class Revenue
{
    // instance variables 
    private double finalrev;

    /**
     * Constructor for objects of class Revenue
     */
    public Revenue()
    {
        finalrev = 0;
    }

    //Used to check the quantity purchased and find the revenue earned
    public void calculateRevenue(int quantity, int unitprice)
    {
        double discount = 0;
        double discountval = 0;
        double totalcost = 0;
        if (quantity > 120){
            discount = 0.15;
            totalcost = unitprice * quantity;
            discountval = discount * totalcost;
            finalrev = totalcost - discountval;
        
        }
        else{
            if (quantity > 100 && quantity <= 120 ){
                discount = 0.10;
                totalcost = unitprice * quantity;
                discountval = discount * totalcost;
                finalrev = totalcost - discountval;
                
            }
            else {
                finalrev = unitprice * quantity;
            } 
        }
        System.out.println("Revenue is : " + finalrev);
    }
    
    public void loop (){
        for (int i = 0; i <= 100; i+=5){
            System.out.println(i);
        }
    }
}



