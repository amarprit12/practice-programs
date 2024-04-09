package Practice.Test6;

public class test3 {
    public static void main(String[] args) {
        int n =5;
//        boolean res = checkPrime(n);
        boolean res = checkPrime1(n);
        if(res){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }

    private static boolean checkPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i = 2; i<=n/2;i++)
        {
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    private static boolean checkPrime1(int n) {
        if(n<=1){
            return false;
        }
        for(int i = 2; i<Math.sqrt(n);i++)
        {
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}
