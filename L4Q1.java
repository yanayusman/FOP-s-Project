package LAB4;
import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter an Integer: ");
        num = sc.nextInt();
        sc.close();

        System.out.print("The factors are: ");
        for(int i = 1; i <= num; i++)
            if(num%i == 0){
                System.out.print(i); 
                if(num != i){
                    System.out.print(", "); 
                }else{
                    System.out.print(" ");
                }
            }              
    }
}
