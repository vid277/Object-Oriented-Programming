class solute{
    public solute(String s){
        String finalstring = "";
        int multiplier = 0;
        int counter = 0;
        for (int i = 0; i< s.length(); i++) {
            char symbol = s.charAt(i);
            if (Character.isLetter(symbol)) {
                    finalstring += symbol;
                } else if (Character.isDigit(symbol)) {
                    if (counter <= 2){
                        multiplier = Character.getNumericValue(symbol);
                        for (int x = 0; x < multiplier; x++) {
                            finalstring = finalstring + s.charAt(i+1);
                        } 
                    }
                    else{
                        i++;
                    }
                    counter++;
            }
        }
        
        return finalstring;
    }
    
    /*public static String solve(String s){
        String new_s = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if (Character.isLetter(c)){
                s = s + c;
            }
            else if (Character.isDigit(c)){
                
            }
        }
    }*/
}






