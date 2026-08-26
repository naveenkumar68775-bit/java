// // import java.util.Scanner;
// // public class school {
// //     String passorfail(int n){
// //         if(35>n){
// //             return "Fail";
// //         }
// //         else{
// //             return "PASS";
// //         }
// //     }
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();
// //         school v=new school();
// //         String result=v.passorfail(n);
// //         System.out.println(result);

// //     }
// // }

// class school{
//     // String name;
//     // school(String name){
//     //     this.name=name;
//     // }
//     // static String name="Thunder";
//     void mai(){
//         System.out.println("Hello");
//     }
//     public static void main(String []args){
//         // System.out.println();
//     //     school v=new school("Ligthning");
//     //     System.out.println(v.name);

//     // }
//     // try {
//     //     int n=10/0;
//     // }
//     // catch(ArithmeticException e){
//     //     System.out.println("Error");
//     // }
//     // finally{
//     //     System.out.println("Hello");
//     // }
//     school v=new school();
//         v.mai();
// }}


// class school{
//     void mai(){
//         System.out.println("Hello");
//     }
//     public static void main(String []args){
//         school v=new school();
//         v.mai();
//     }
// }

// class school{
//     public static void main(String[] args) {
//         int n=10;
//         int m=20;
//         int v[][]=new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 v[i][j]=i+j;
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(v[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

class school{
    public static void main(String[] args) {
       for(char i='A';i<='Z';i++){
        for(char j='A';j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
    }
}