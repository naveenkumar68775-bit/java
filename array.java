package java.java;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int sum=0;
        Scanner levi=new Scanner(System.in);
        int value=levi.nextInt();
        int[]arr=new int[value];
        for(int i=0;i<value;i++){
            arr[i]=levi.nextInt();
            sum=sum+arr[i];
        }

        System.out.println(sum);
    }
}
