public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = 1;
        
        for(int i = 1; i <= n; i++){          // No.of.Rows
            
            for(int j = 1; j <= k; j++){      // Inside a row
                   System.out.print("*");
            }
            k++;                              // Prep for next row
            System.out.println();
        }
    }
}