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
        
        System.out.println("Input Matrix");
        for (int i = 0 ; i < input.length ; i++)    {
            for (int j = 0 ; j < input[i].length ; j++)
                System.out.printf("%4d", input[i][j]);
            System.out.println("");
        }
        
        for (int layer = 0 ; layer < m / 2 ; layer++)   {
            int first = layer;
            int last = m - 1 - layer;
            
            for (int i = first ; i < last ; i++)    {
                // offset
                int offset = i - first;
                
                // save top
                int top = input[first][i];
                
                // left to top
                input[first][i] = input[last - offset][first];
                
                // bottom to left
                input[last - offset][first] = input[last][last - offset];
                
                // right to bottom
                input[last][last - offset] = input[i][last];
                
                // top to right
                input[i][last] = top;
            }
        }
        
        System.out.println("Output Matrix");
        for (int i = 0 ; i < input.length ; i++)    {
            for (int j = 0 ; j < input[i].length ; j++)
                System.out.printf("%4d", input[i][j]);
            System.out.println("");
        }
    }
}
