package Chapter1;

/**
 *
 * @author vasu
 */
public class N9_StringRotation {
    public static void main(String[] args) {
        String s1 = "waterbottle1";
        String s2 = "terbottlewa";
        
        s2 = s2.concat(s2);
        
        // now simply find s1 in s2
        System.out.println(s2.indexOf(s1));
    }
}
