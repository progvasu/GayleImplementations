package Chapter1;

/**
 *
 * @author vasu
 */
public class N8_ZeroMatrix {
    public static void main(String[] args) {
        int input[][] = {
                            {1, 2, 3, 4},
                            {3, 0, 7, 8},
                            {6, 7, 9, 2},
                            {4, 6, 0, 1},
                            {9, 5, 8, 5}
                        };
        
        System.out.println("Input Matrix");
        for (int i = 0 ; i < input.length ; i++)    {
            for (int j = 0 ; j < input[i].length ; j++)
                System.out.printf("%4d", input[i][j]);
            System.out.println("");
        }
        
        // taking two arrays that will store the zero position rows and columns
        boolean rows[] = new boolean[input.length];
        boolean cols[] = new boolean[input[0].length];
        
        // populating rows and cols
        for (int i = 0 ; i < input.length ; i++)    {
            for (int j = 0 ; j < input[i].length ; j++) {
                if (input[i][j] == 0)   {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        
        System.out.println("Output Matrix");
        for (int i = 0 ; i < input.length ; i++)    {
            for (int j = 0 ; j < input[i].length ; j++) {
                if (rows[i] || cols[j])
                    System.out.printf("%4d", 0);
                else
                    System.out.printf("%4d", input[i][j]);
            }
            System.out.println("");
        }
    }
}
