public class primesinrange {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        primesinrange(20);
    }
    public static void primesinrange(int n) {
        for(int i = 1; i<=n;i++){
            if(isPrime(i)){ 
                            System.out.print(i+" ");
                        }
                    }         
                }
            }