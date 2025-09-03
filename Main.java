public class Main{
    // all code here 

    // need know if one number is pair
    public static void isPair(int n){
        if ( n % 2 == 0){
            System.out.println("The number "+n+" is pair");
        }else{
            System.out.println("The number "+n+" is not pair");
        }
    }

    // need method fibonacci
    public static int fibonacci(int n){
        if ( n <= 1 ) return n;
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int sum(int a, int b){
        return a + b;
    }
}