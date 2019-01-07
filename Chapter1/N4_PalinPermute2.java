// using gayles bit vector implementation
package Chapter1;

/**
 *
 * @author vasu
 */
public class N4_PalinPermute2 {
    static int toggle(int bitVector, int ch)    {
        
    }
    
    static int createBitVector(String input)   {
        int bitVector = 0;
        for (int ch : input.toLowerCase().toCharArray())   {
            ch = ch = 'a';
            // assuming just letters no numbers and no special characters
            bitVector = toggle(bitVector, ch);
        }
        
        return bitVector;
    }
            
    static boolean isPalinPermute(String input) {
        int bitVector = createBitVector(input);
        
        return true;
    }
    
    public static void main(String[] args) {
        String input = "Tact Coa";
        
        boolean result = isPalinPermute(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
