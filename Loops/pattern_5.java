public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        int k = 1;                       // first row, here k determines no.of Elements at each Row
        
        for(int i = 1; i <= n; i++){          // No.of.Rows
            
            for(int j = 1; j <= k; j++){      // Inside a row
                   System.out.print(val);
                val++;                        // val increments at each iteration inside a row
            }
            k++;                              // Prep for next row
            System.out.println();
        }                               //Tip : for numeric patterns 1st implement using *
    }
}