public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1;                            // First Row 
        int sp = n/2;
        
        for(int i = 1; i <= n; i++){          // No.of.Rows
            
            for(int j = 1; j <= sp; j++){      // Inside a row
                System.out.print(" ");
            }
            for(int k = 1; k <= st; k++){
                System.out.print("*");
            }
                                               // Prep for next row
            if(i <= n/2){
                st = st + 2;
                sp--;
            }          
            else{
                st = st - 2;
                sp++;
            }
            System.out.println();
        }
    }
}