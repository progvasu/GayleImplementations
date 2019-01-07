package Chapter1;

/**
 *
 * @author vasu
 */
public class N7_RotateMatrix {
    public static void main(String[] args) {
        int[][] input = {       {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12},
                                {13, 14, 15, 16}    };
        int m = input.length;
        
        for (int layer = 0 ; layer < m / 2 ; layer++)   {
            int first = layer;
            int last = m - 1 - layer;
        }
    }
}
