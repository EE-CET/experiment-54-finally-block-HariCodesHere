import java.util.Scanner;

public class FinallyDemo {
    
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b=sc.nextInt();

                try{
                        int c = a/b;
                        System.out.println("Result: "+c);
                }
                catch(ArithmeticException ex){
                        System.out.println("Error: " + ex.getMessage() );
                }
                finally {
                        System.out.println("Finally block executed");
                }
        }
}

