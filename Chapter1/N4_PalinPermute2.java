// using gayles bit vector implementation
package Chapter1;

/**
 *
 * @author vasu
 */
public class N4_PalinPermute2 {
    static int toggle(int bitVector, int ch)    {
        if ((bitVector & (1 << ch)) > 0)
            // toggling the one present
            bitVector = bitVector & ~(1 << ch);
        else
            // if zero
            // toggling a one there
            bitVector = bitVector | (1 << ch);
        
        // could store (1 << ch) in a variable called mask
        
        return bitVector;
    }
    
    static int createBitVector(String input)   {
        int bitVector = 0;
        // ignoring case!
        for (int ch : input.toLowerCase().toCharArray())   {
            ch = ch - 'a';
            // assuming just letters no numbers and no special characters
            bitVector = toggle(bitVector, ch);
        }
        
        return bitVector;
    }
            
    static boolean isPalinPermute(String input) {
        int bitVector = createBitVector(input);
        
        // is exactly one bit is set
        boolean result = bitVector == 0;
        
        // just a single bit is set
        result = result || ((bitVector & (bitVector - 1)) == 0);
        // because 00010000 - 1 = 00001111
        // if 00110000 - 1 = 00101111
         
        return result;
    }
    
    public static void main(String[] args) {
        String input = "tcotCoa a";
        
        boolean result = isPalinPermute(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
