class solute{
    public String solute(String s){
        String finalstring = "";
        for (int i = 0; i< s.length(); i++) {
            char symbol = s.charAt(i);
            if (Character.isLetter(symbol)) {
                    finalstring += symbol;
                } else if (Character.isDigit(symbol)) {
                    if (i+1 < s.length()){
                        char d = s.charAt(i+1);
                        if (Character.isLetter(d)){
                            int multiplier = Character.getNumericValue(symbol);
                            for (int x = 0; x < multiplier; x++) {
                                finalstring = finalstring + s.charAt(i+1);
                            }    
                        }  
                    }
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






