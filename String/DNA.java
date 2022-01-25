
/**
 * This class would figure out who the DNA would belong to
 *
 * @author (Vidyoot Senthilvenkatesh)
 * @version (9/21/2021)
 */
public class DNA
{
    // instance variables - replace the example below with your own
    private String seq1 = "AGACGGGTTACCATGACTATCTATCTATCTATCTATCTATCTATCTATCACGTACGTACGTATCGAGATAGATAGATAGATAGATCCTCGACTTCGATCGCAATGAATGCCAATAGACAAAA";
    private String seq2 = "AACCCTGCGCGCGCGCGATCTATCTATCTATCTATCCAGCATTAGCTAGCATCAAGATAGATAGATGAATTTCGAAATGAATGAATGAATGAATGAATGAATG";
    private String seq3 = "CCAGATAGATAGATAGATAGATAGATGTCACAGGGATGCTGAGGGCTGCTTCGTACGTACTCCTGATTTCGGGGATCGCTGACACTAATGCGTGCGAGCGGATCGATCTCTATCTATCTATCTATCTATCCTATAGCATAGACATCCAGATAGATAGATC";
    private String seq4 = "GGTACAGATGCAAAGATAGATAGATGTCGTCGAGCAATCGTTTCGATAATGAATGAATGAATGAATGAATGAATGACACACGTCGATGCTAGCGGCGGATCGTATATCTATCTATCTATCTATCAACCCCTAG";
    
    /**
     * Constructor for objects of class DNA
     */
    public DNA(String name, String a1, int n1, String a2, int n2, String a3, int n3)
    {
        String s4 = a1;
        String s5 = a2;
        String s6 = a3;
        
        s4 = s4.repeat(n1);
        s5 = s5.repeat(n2);
        s6 = s6.repeat(n3);
        
        if (seq1.indexOf(s4) != -1 && seq1.indexOf(s5) != -1 && seq1.indexOf(s6) != -1){
            System.out.println("Sequence 1 belongs to: " + name);
        } else {
            System.out.println("Sequence 1 does not belong to: " + name);
        }
        
        if (seq2.indexOf(s4) != -1 && seq2.indexOf(s5) == -1 && seq2.indexOf(s6) != -1){
            System.out.println("Sequence 2 belongs to" + name);
        } else {
            System.out.println("Sequence 2 does not belong to: " + name);
        }
        
        if (seq3.indexOf(s4) != -1 && seq3.indexOf(s5) != -1 && seq3.indexOf(s6) != -1){
            System.out.println("Sequence 3 belongs to: " + name);
        } else {
            System.out.println("Sequence 3 does not belong to: " + name);
        }
        
        if (seq4.indexOf(s4) != -1 && seq4.indexOf(s5) != -1 && seq4.indexOf(s6) != -1){
            System.out.println("Sequence 4 belongs to: " + name);
        } else {
            System.out.println("Sequence 4 does not belong to: " + name);
        }
    }
}
