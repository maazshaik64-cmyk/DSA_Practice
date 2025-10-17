public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        int nFact = fact(n);
        int rFact = fact(r);
        int nmrFact = fact(n-r);
        
        int res = nFact / (rFact * nmrFact);
        System.out.println(res);
    }
    
    public static int fact(int n){
        int temp = 1;
        for(int i = 1; i <= n; i++){
            temp=temp*i;
        }
        return temp;    
    }   
}