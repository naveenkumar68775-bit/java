// class rev{
//     public static void main(String[]args){
//         int a=10;
//         int b=30;
//         System.out.print(a+b);
//     }
// }

// import java.util.*;
// class Rev{
//     public static void main(String []args){
//         int n=12345;
//         int rev=0;
//         while(n>=0){
//             int digit=n%10;
//             rev=rev*10+digit;
//             n=n/10;

//         }
//         System.out.print(rev);
        
//     }
// }

class Rev{
    public static void main(String []args){
        // String str="hello";
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     count=count+1;
        // }
        // System.out.print(count);

        String str="Thunder";
        char ch=str.charAt(0);
        char c=str.charAt(str.length()-1);
        System.out.println(ch);
        System.out.print(c);
    }
}