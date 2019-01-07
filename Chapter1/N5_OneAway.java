package Chapter1;

/**
 *
 * @author vasu
 */
public class N5_OneAway {
    static boolean isOneAwaySimple(String s1, String s2)  {
        if (s1.length() == s2.length())
            // only a single replacement if possible
            return isReplace(s1, s2);
        else if (s1.length() - 1 == s2.length())
            // s1 shorter by 1
            return isInsertOrRemove(s1, s2);
        else if (s1.length() + 1 == s2.length())
            // s2 shorter by 1
            return isInsertOrRemove(s2, s1);
        
        return false;
    }
    
    static boolean isReplace(String s1, String s2)  {
        boolean oneReplace = false;
        
        for (int i = 0 ; i < s1.length() ; i++) {
            if (s1.charAt(i) != s2.charAt(i))   {
//                System.out.println(s1.charAt(i) + " " + s2.charAt(i));
                if (oneReplace)
                    return false;
                oneReplace = true;
            }
        }
        
//        System.out.println("Should not be triggered is strings different in two places");
        return oneReplace;
    }
    
    static boolean isInsertOrRemove(String s1, String s2)   {
        int ind1 = 0, ind2 = 0;
        
        while (ind2 < s2.length() && ind1 < s1.length())  {
            if (s1.charAt(ind1) != s2.charAt(ind2))
                if (ind1 != ind2)
                    return false;
                else
                    // this is our replace or insert move
                    ind2++;
            
            ind1++;
            ind2++;
        }
        
        return true;
    }
    
    static boolean isOneAwayCompact(String s1, String s2) {
        // length check
        if (Math.abs(s1.length() - s2.length()) > 1)
            return false;
        
        int ind1 = 0;
        int ind2 = 0;
        
        // getting the shorter and longer string
        String shorter = (s1.length() < s2.length()) ? s1 : s2;
        String longer = (s2.length() < s1.length()) ? s2 : s1;
        
        boolean foundDiff = false;
        while (ind2 < longer.length() && ind1 < shorter.length())   {
            if (shorter.charAt(ind1) != longer.charAt(ind2))    {
                if (foundDiff)
                    return false;
                foundDiff = true;
                
                // on replace moving the first shorter index forward
                if (shorter.length() == longer.length())
                    ind1++;
            
                // we dont move the first index forward in case of differnet lengths
                // because we insert or remove the character and thus still need to match the
                // smaller string's current character
            }
            else
                // if matching move shorter index forward
                ind1++;
            
            // always move second index forward
            ind2++;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "bale";
        
        System.out.println("Method 1 - Easy to understand: " + isOneAwaySimple(s1, s2));
        System.out.println("Method 2 - Easy to maintain(compact): " + isOneAwayCompact(s1, s2));
    }
}
