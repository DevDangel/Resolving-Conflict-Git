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

    public static void mltp(){
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(i+" x " + j + " = " + (i * j) + "\t");
            }
        }
    }

    public static int sum(int a, int b){
        return a + b;
    }
}