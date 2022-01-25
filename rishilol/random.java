import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class random {
    
    boolean comp = false;
    boolean me = false;
    int playercards = 26;
    int computercards = 26;

    ArrayList<String> drawCompu = new ArrayList<String>();
    ArrayList<String> playerCode = new ArrayList<String>();

    Random rand = new Random(); 
    String deck[] = new String[14];
    int num; 
    int String[];
    Scanner scan;

    public random(){
        random();
    }

    public void random(){
        int counter = 0;
        int countai = 0;

        scan = new Scanner(System.in);

        System.out.println("Press enter to draw a card: ");

        for (int i = 1; i < 14; i++){
            deck[i] = i + "";
        }
        
        
        while (counter < 52){
            num = rand.nextInt(13)+1;
            counter++;
        }

        if (scan.nextLine().equals("")){
            drawCard(num);
        }
    }

    public ArrayList<String> drawCard(int num) {
        playerCode.add(deck[num]);

        //System.out.println(playerCode.toString());
        me = true;
        drawCompu();
        return playerCode;
    }

    public ArrayList<String> drawCompu(){
        int numer = rand.nextInt(13)+1;
        drawCompu.add(deck[numer]);
        //System.out.println(drawCompu.toString());
        comp = true;
        check();
        return drawCompu;
    }

    public void check() {
        if(playercards == 52 || computercards == 52){
            if (playercards > computercards){
                System.out.println("Player wins");
            }
            else if (computercards > playercards){
                System.out.println("Computer wins");
            }
        }
        else{
        for (int i = 0; i < drawCompu.size(); i++){
                if (Integer.parseInt(drawCompu.get(i)) > Integer.parseInt(playerCode.get(i))){
                    playercards = playercards - 1;
                    computercards = computercards + 1;
                    System.out.println("Player: " + playercards);
                    System.out.println("Computer: " + computercards);
                    random();
                }
                else if (Integer.parseInt(drawCompu.get(i)) < Integer.parseInt(playerCode.get(i))){
                    playercards = playercards + 1;
                    computercards = computercards - 1;
                    System.out.println("Player: " + playercards);
                    System.out.println("Computer: " + computercards);
                    random();
                }
                else if(Integer.parseInt(drawCompu.get(i)) == Integer.parseInt(playerCode.get(i))){
                    random();
                }
            }
        }
}
}
