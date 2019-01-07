package Chapter1;

public class N1_IsUnique {
    static boolean isUnique (String input) {
        // if the strings length is more than 128 than return false
        // assuming simple 128 character ASCII
        if (input.length() > 128)
            return false;
        
        // not assuming extended ascii code
        // simple ascii 128 unique characters
        boolean[] char_array = new boolean[128];
        
        for (int ch : input.toCharArray()) {
            if (char_array[ch])
                return false;
            else
                char_array[ch] = true;
        }
        
        return true;
    }
    
    // new technique
    // using an 8 bit vector as the additional data structure
    // we assume the input string has just chars from 'a' to 'z' i.e. 26 characters
    // so that we can use an int variable as our bit vector
    static boolean isUniqueBitVector(String input)  {
        // bit vector
        // since size of int is 32 bits (4 bytes)
        // we can have one bit for every character
        int checker = 0;
        
        for (int ch : input.toCharArray())  {
            // getting values from 0 to 25
            ch = ch - 'a';
            
            // checking if we have previously seen this character
            // 1 << ch - create a bit vector with 1 at char ch location
            if ((checker & (1 << ch)) > 0)    {
                return false;
            }
            
            // if not move 1 to appropriate position in checker
            checker |= (1 << ch);
        }
        
        return true;
    }
    
    public static void main(String[] args)  {
        String input = "vasubansal";
      
        System.out.println("String: " + input + " Output: " + isUnique(input));
        System.out.println("String: " + input + " Output: " + isUniqueBitVector(input));
    }
}
