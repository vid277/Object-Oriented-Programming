
/**
 * This class implements a pet.
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (9/2/2021)
 */
public class Pet
{
    // instance variables - replace the example below with your own
    private String name;
    private String type;
    private int weight; 

    /**
     * Constructor for objects of class pet
     */
    public Pet()
    {
        name = "";
        type = "";
        weight = 0;
    }
    
    //accessor method
    //The following method gives the value of name
    public String getName(){
        return name;
    }
    //The following method gives the value of type
    public String getType(){
        return type;
    }
    //The following method gives the value of weight
    public int getWeight(){
        return weight;
    }
    
    //The following method changes the name of the pet - Mutators method
    public void setName(String name){
        this.name = name;
    }
    
    //The following method changes the type of the pet - Mutators method
    public void setType(String type){
        this.type = type;
    }
    
    //The following method changes the weight of the pet - Mutators method
    public void setWeight(int weight){
        if (weight > 35){
            System.out.println("The weight cannot exceed 35lbs");
        }
        else{
            this.weight = weight;
        }
    }

    public void details()
    {
        System.out.println("Details of my pet:");
        System.out.println("Name of my pet: "+ name);
        System.out.println("Type of my pet: "+ type);
        System.out.println("Weight of my pet: " + weight);
        System.out.println("I love my pet");
    }
    
    //constructor
    public Pet (String name, String type, int weight)
    {
        this.name = name;
        this.type = type;
        if (weight > 35){
          System.out.println("The weight cannot exceed 35lbs");
          this.weight = 0;
        }
        else {
        this.weight = weight;
        }
    }
}
