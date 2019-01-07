package Chapter1;

/**
 *
 * @author vasu
 */
public class N6_StringCompression {
    public static void main(String[] args) {
        String input = "aabcccccaaaf";
        
        // simply count and build
        StringBuilder result = new StringBuilder();
        
        //
        char temp = input.charAt(0);
        int count = 1;
        for (int i = 1 ; i < input.length() ; i++)  {
            if (input.charAt(i) == temp)
                count++;
            else    {
                result.append(temp).append(String.valueOf(count));
                temp = input.charAt(i);
                count = 1;
            }
        }
        
        result.append(temp).append(String.valueOf(count));
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
