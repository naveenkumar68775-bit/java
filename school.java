// import java.util.Scanner;
// public class school {
//     String passorfail(int n){
//         if(35>n){
//             return "Fail";
//         }
//         else{
//             return "PASS";
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         school v=new school();
//         String result=v.passorfail(n);
//         System.out.println(result);

//     }
// }

class school{
    // String name;
    // school(String name){
    //     this.name=name;
    // }
    // static String name="Thunder";
    public static void main(String []args){
        // System.out.println();
    //     school v=new school("Ligthning");
    //     System.out.println(v.name);

    // }
    try {
        int n=10/0;
    }
    catch(ArithmeticException e){
        System.out.println("Error");
    }
    finally{
        System.out.println("Hello");
    }
}}
