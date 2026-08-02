
import java.util.*;

// public class pattern {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int s=sc.nextInt();
//         for(int i=1;i<=s;i++){
//             for(int j=1;j<=s;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
        
//     }
    
// }

// public class pattern{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0;i<=n;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println(" ");
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         int n=5;
//         int num=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println("");
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         int n =5;

//         for(char i=0;i<=n;i++){
//             char ch = (char) ('A' + i - 1);
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch + " ");
//             }
//             System.out.println("");
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i*2-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

/**
 * pattern
 */
// public class pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i >= 1; i--) {
//             // 1. Print leading spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // 2. Print stars (creates odd numbers: 9, 7, 5, 3, 1)
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             // 3. Move to next line
//             System.out.println();
//         }
//     }
// }


/**
 * pattern
 */
public class pattern {

    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n ; i++){
            for(int j=0;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}