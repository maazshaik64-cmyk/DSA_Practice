public class Main {
    public static void main(String[] args) {
        int N = 12;
        for(int i = 1; i <= N; i++){
            if(N % i == 0)
                System.out.println(i);
        }
    }
}
// use for loop when you need extra loop variable
