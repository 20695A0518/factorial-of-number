import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the Number between 0-10");
        Scanner sc=new Scanner(System.in);
        Factorial f1=new Factorial();

        try{
            int n=sc.nextInt();
            if(n<10 && n>0){
                System.out.println(f1.fact(n)) ;
            }
            else {
                System.out.println("Error: Please enter a number between 0 and 10.");
                throw new Exception();

            }
        }
        catch (Exception e){
            System.out.println("User Error");
        }
        finally {
            sc.close();
        }
    }

}