public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        while(N>0){
            int L = N % 10;
            System.out.print(L);
            N = N / 10;
            
        }
    }        
}