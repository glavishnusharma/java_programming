public class PascalTriangle {
    
    static int nCr(int n, int r) {
        int res = 1;
        if (r > n - r) r = n - r; 
        for (int i = 0; i < r; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    
    static void printPascal(int rows) {
        for (int n = 0; n < rows; n++) {
            
            for (int space = 0; space < rows - n; space++) {
                System.out.print(" ");
            }
            
            for (int r = 0; r <= n; r++) {
                System.out.print(nCr(n, r) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; 
        printPascal(rows);
    }
}
