package Chapter1;

import java.util.Arrays;

public class N2_CheckPermutation {
    // sorting the string and checking
    static boolean isPermute(String input1, String input2)  {
        char[] char_array1 = input1.toCharArray();
        char[] char_array2 = input2.toCharArray();
        
        
        Arrays.sort(char_array1);
        Arrays.sort(char_array2);
        
        // Method 1
        // return Arrays.equals(char_array1, char_array2);
    
        // Method 2 - Equivalently could do
        return (new String(char_array1)).equals(new String(char_array2));
    }
    
    // checking with character count
    static boolean isPermuteCount(String input1, String input2) {
        // assuming simple ascii 128 characters
        int[] array1 = new int[128];
        
        // filling in the array
        for (char ch : input1.toCharArray())  {
            array1[ch]++;
        }
        
        // checking with string 2
        for (char ch : input2.toCharArray())    {
            if (--array1[ch] < 0)   {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String input1 = "god";
        String input2 = "cog";
        
        System.out.println("Input1: " + input1 + " Input2: " + input2);
        System.out.println("Sort Output: " + isPermute(input1, input2));
        System.out.println("Count Output: " + isPermuteCount(input1, input2));
    }
}
