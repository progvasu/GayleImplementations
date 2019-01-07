package Chapter1;

import java.util.Arrays;

public class N3_URLify {
    static String addSpaceChar(String input, int true_length)  {
        // find the new length of the string
        int no_spaces = 0;
        for (int i = 0 ; i < true_length ; i++)
            if (input.charAt(i) == ' ')
                no_spaces++;
        
        int new_len = true_length + no_spaces * 2;
        
        // we modified a question a little we are not assuming that input is a 
        // char array and has extra space at the end
        // we assume input to be a string and add extra space ourselves
        
        char[] result = new char[new_len];
        
        for (int i = true_length - 1 ; i >= 0 ; i--)    {
            if (input.charAt(i) == ' ')  {
                result[--new_len] = '0';
                result[--new_len] = '2';
                result[--new_len] = '%';
            }
            else
                result[--new_len] = input.charAt(i);
        }
        
        return new String(result);
    }
    
    public static void main(String[] args) {
        String input = "Mr John Smith   ";
        int true_length = 13;
        
        String result = addSpaceChar(input, true_length);
        System.out.println("Output: " + result);
    }
}
