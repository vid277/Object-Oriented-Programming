
/**
 * Working with arrays
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (9/27/2021)
 */
public class Numbers
{
    // instance variables - replace the example below with your own
    private int[] num;

    /**
     * Constructor for objects of class Numbers
     */
    public Numbers()
    {
        num = new int[100]; //Create an empty array
        for (int i = 0; i < 10; i++){
            num[i] = (int)((Math.random()*100+1)-50);
            System.out.println(num[i]);
        }
    }
    
    //Adds all the numbers of the list
    public void sum(){
        int sum = 0;
        for (int i = 0; i < 101; i++){
            sum = num[i] + sum;
        }
        System.out.println("Sum: " + sum);
    }

    //This method multiplies each number in the array by the method parameter
    public void multiply(int k){
        for (int i = 0; i < 100; i++){
            num[i] = num[i]*k;
            System.out.println(num[i]);
        }
    }
    
    //Finds the largest number in the array
    public void max(){
        int max = num[0];
        for (int i = 0; i < 100; i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.println("The max number is: " + max);
    }

    //This method determines what percentage numbers in the array are less than 50
    public double percentage(){
        int count = 0;
        double percent;
        for (int i = 0; i < 100; i++){
            if (num[i] <= 50 ){
                count++;
            }
        }
        percent = ((double)count/100)*100;
        //System.out.println(percent + "%");
        return percent;
    }
                                   
    public void trial(int k){
        double average = 0;
        for (int i = 0; i < k; i++){
            Numbers n = new Numbers();
            average = n.percentage() + average;
        }
        System.out.println((double)average/(double)(k));
    }
    
    //This method sorts a list from low to high
    public void sort(String s1){
        int temp = 0;
        if (s1.equals("up")){
            for (int i = 0; i < 10; i++){
                for (int c = 0; c < 10; c++){
                   if (num[c] > num[i]){
                       temp = num[c];
                       num[c] = num[i];
                       num[i] = temp;
                   }
                }            
            }            
        }
        else if (s1.equals("down")){
            for (int i = 0; i < 10; i++){
                for (int c = 0; c < 10; c++){
                   if (num[c] < num[i]){
                       temp = num[i];
                       num[i] = num[c];
                       num[c] = temp;
                   }
                }            
            }                        
        }
        else{
            System.out.println("ERROR - Neither up or down");
        }
        for (int i = 0; i < 10; i++){
           System.out.println("New array " + num[i]);   
        }
    }
}
