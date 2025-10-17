public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 1;                            // First Row 
        int st = (n/2) + 1;
        
        for(int i = 1; i <= n; i++){          // No.of.Rows
            
            for(int j = 1; j <= st; j++){      // Inside a row
                System.out.print("*");
            }
            for(int k = 1; k <= sp; k++){
                System.out.print(" ");
            }
            for(int l = 1; l <= st; l++){      // Inside a row
                System.out.print("*");
            }
                                               // Prep for next row
            if(i <= n/2){
                st--;
                sp = sp + 2;
            }          
            else{
                sp = sp - 2;
                st++;
            }
            System.out.println();
        }
    }
}