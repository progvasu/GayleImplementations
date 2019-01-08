// earlier we didn't change the original matrix and just printed out the result
// now we change the original matrix

// two methods
// use the boolean arrays as used in part one
// or use the first row and first column as the replacements
// we use the second method

package Chapter1;

/**
 *
 * @author vasu
 */
public class N8_ZeroMatrix2 {
    public static void main(String[] args) {
        int input[][] = {
                            {1, 0, 3, 4},
                            {3, 0, 7, 8},
                            {6, 7, 9, 2},
                            {4, 6, 1, 1},
                            {9, 5, 8, 5}
                        };
        
        System.out.println("Input Matrix");
        for (int i = 0 ; i < input.length ; i++)    {
            for (int j = 0 ; j < input[i].length ; j++)
                System.out.printf("%4d", input[i][j]);
            System.out.println("");
        }
        
        // first checking to see if there is a zero in first row or column
        // we will initialize it to zero later
        boolean rowZero = false;
        boolean colZero = false;
        
        // first row
        for (int j = 0 ; j < input[0].length ; j++)
            if (input[0][j] == 0)   {
                rowZero = true;
                break;
            }
                
        // first column
        for (int i = 0 ; i < input.length ; i++)    
            if (input[i][0] == 0)   {
                colZero = true;
                break;
            }
        
        // for the rest of the matrix
        for (int i = 1 ; i < input.length ; i++)
            for (int j = 1 ; j < input[0].length ; j++)
                if (input[i][j] == 0)   {
                    input[i][0] = 0;
                    input[0][j] = 0;
                }
        
        // making rows zero
        for (int i = 1 ; i < input.length ; i++)    {
            if (input[i][0] == 0)
                nullifyRow(input, i);
        }
        
        // making cols zero
        for (int j = 1 ; j < input[0].length ; j++)    {
            if (input[0][j] == 0)
                nullifyCol(input, j);
        }
        
        // first row or col zero?
        if (rowZero)
            nullifyRow(input, 0);
        if (colZero)
            nullifyCol(input, 0);
        
        // print out the matrix
        System.out.println("Output Matrix");
        for (int i = 0 ; i < input.length ; i++)    {
            for (int j = 0 ; j < input[i].length ; j++)
                System.out.printf("%4d", input[i][j]);
            System.out.println("");
        }
    }
    
    static void nullifyRow(int[][] input, int row)   {
        for(int j = 0 ; j < input[0].length ; j++)
            input[row][j] = 0;
    }
    
    static void nullifyCol(int[][] input, int col)   {
        for(int i = 0 ; i < input.length ; i++)
            input[i][col] = 0;
    }
}
