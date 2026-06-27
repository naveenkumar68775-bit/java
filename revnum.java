package java.java;
import java.util.Scanner;

public class revnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int revnum=0;
        while(a!=0){
            int rem=a%10;
            revnum=revnum*10 +rem;
            a/=10;
        }
        System.out.println(revnum);
    }
}
