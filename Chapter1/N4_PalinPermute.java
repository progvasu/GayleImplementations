package Chapter1;

public class N4_PalinPermute {
    static boolean isPalinPermute(String input) {
        // create char array
        // assuming 128 character ASCII
        int[] char_array = new int[128];
        
        // fill in the array
        // ignoring spaces
        for (char ch : input.toLowerCase().toCharArray())
            if (ch != ' ')
                char_array[ch]++;
        
        // only even values and one odd value allowed
        int count = 0;
        for (int i = 0 ; i < char_array.length ; i++)  {
            if (char_array[i] %2 == 0) {
            } 
            else if (char_array[i] % 2 != 0 && count == 0)   {
                count = 1;
            }
            else
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String input = "Tact Coa";
        
        boolean result = isPalinPermute(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
