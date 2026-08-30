import java.util.*;
// public class solution {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//     list.add("Java");
//     list.add("Python");
//     list.add("Java");

// System.out.println(list);
// System.out.println(list.get(0));
//     }
// }


// class solution
// {
//     public static void main(String[] args) {
//         List<Integer> list = new ArrayList<>();
//         list.add(1786);
//         list.add(2006);
//         list.add(3020);
       
//         list.add(1,688);
//          System.out.println(list);
//          list.remove(1);
//         list.set(0, 6626);
//         list.addFirst(111);
//         list.addLast(10000);
//         for(int i: list){
//             System.out.println(i);
//         }
       


//     }
// }

// class solution{
//     public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<>();
//         list.add(1);
//         list.add(2);
//         list.addFirst(0);
//         System.out.println(list);
//         list.addLast(111);
//         System.out.println(list);
//         list.removeFirst();
//         System.out.println(list);
//         list.removeLast();
//         System.out.println(list);
//     }
// }

// class solution{
//     public static void main(String []args){
//         System.out.println("God of thunder");

//         Scanner sc=new Scanner(System.in);
//         List<Integer> v=new ArrayList<>();
//         int n=5;
//         for(int i=1;i<=n;i++){
//             v.add(sc.nextInt());
//         }
//         System.out.println(v);
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=0;int b=1;int next;
//         System.out.println(a);
//         System.out.println(b);
//         for(int i=3;i<=n;i++){
            
//             next = a+b;
//             System.out.println(next);
//             a=b;
//             b=next;
//         }
//     }
// }

// class solution{
//     public static void main(String[]args){
//         int n=12345;
//         int rev=0;

//         while(n>0){
//             int digit=n%10;
//             rev = rev*10+digit;
//             n=n/10;
//         }
//         System.out.println(rev);
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         boolean f=false;
//         if(f==true){
//             System.out.println("Allow");

//         }
//         else{
//             System.out.println("Not");
//         }
//     }
// }
import java.util.HashMap;

import java.util.*;
class solution{
    public static void main(String [] args){
        // StringBuffer v=new StringBuffer();
        // v.append("Thunder");
        // v.append("Light");
        // System.out.println(v);
        // v.reverse();
        // System.out.println(v);

        // StringBuilder v=new StringBuilder("Store");
        // v.append("Maximum");
        // System.out.println(v);

        // String s="programming";
        // String[]v=s.split("");
        // int vowels=0;
        // int consonants=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        //         vowels++;
        //     }
        //     else{
        //         consonants++;
        //     }
        // }
        // System.out.println(vowels);
        // System.out.println(consonants);

        // String name="Java is easy to learn";
        // String []n=name.split(" ");
        // int count =0;
        // for(int i=0;i<=n.length-1;i++){
        //     count++;
        // }
        // System.out.println(count);
        // Scanner sc=new Scanner(System.in);
        // String n=sc.nextLine();
        // char v=sc.next().charAt(0);
        // int count=0;

        // for(int i=0;i<=n.length()-1;i++){
        //     char c=n.charAt(i);
        //     if(c==v){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // String name=sc.nextLine();
        // String n[]=name.split("");
        // char c=0;
        // for(int i=0;i<=name.length()-1;i++){
        //     for(int j=i+1;j<=name.length()-1;j++){
        //         if(n[i].equals(n[j])){
        //             System.out.println(n[i]);

        //         }

        //     }
        // }
        // String name=sc.nextLine();
        // String n[]=name.split("");
        // String total="";
        // for(int i=0;i<=name.length()-1;i++){
        //     boolean v=false;
        //     for(int j=i+1;j<=name.length()-1;j++){
        //         if(n[i].equals(n[j])){
        //             v=true;
        //             break;
                    

        //         }
              

        //     }
        //       if(!v){
        //             total=total+n[i];
        //         }
        //     //  System.out.println(total);
        // }
        // System.out.println(total);

        // String n="programming";
        // String s[]=n.split("");

        // for(int i=0;i<=n.length()-1;i++){
        //     for(int j=i+1;j<=n.length()-1;j++){
        //         if(s[i].equals(s[j])){
        //             System.out.println(s[i]);
        //             // break ;
        //             // return;     // it can be stop
        //         }
        //         // break;
        //     }
        // }
     

        // String s="silent";
        // String s2="lisTEN";

        // char []v1=s.toLowerCase().toCharArray();
        // char []v2=s2.toLowerCase().toCharArray();

        // Arrays.sort(v1);
        // Arrays.sort(v2);

        // if(Arrays.equals(v1,v2)){
        //     System.out.println("Anagram");
        // }
        // else{
        //     System.out.println("Not");
        // Scanner sc=new Scanner(System.in);
        // String s="banana";
        // char []c=s.toCharArray();
        // int count =0;
        
        // for(int i=0;i<=s.length()-1;i++){
        //     for(int j=i+1;j<=s.length()-1;j++){
        //     char ch=s.charAt(i);
        //     char ch2=s.charAt(j);
            
        //     if(ch!=ch2){

        //         count++;
        //     }
        //     else if(ch==ch2){
        //         System.out.println(c[i] +"="+ count);

        //     }
        //     }

        // }
        // System.out.println(ch +"="+ count);

        // int n=12345;

        // int temp=n;
        // int digit=0;
        // for(int i=n;i>0;i--){
        //     System.out.println(i);
        // }
        // System.out.println(digit);

        // while(n>0){
        //     n=n%10;
        //     digit=digit*10+n;
        //     n=n/10;
            
        // }
        // System.out.println(digit);

        //prime

        // int n=22;
        // int count=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count=count+1;
                
        //     }
        //     }
        
        // if(count == 2){
        //     System.out.println("prime");
        // }
        // else{
        //     System.out.println("not");
        // }

        // int a=0;
        // int b=1;
        // int n=7;
        // int digit;
        // System.out.print(a + " " +b);
        // for(int i=3;i<=n;i++){
        //     digit=a+b;
        //     System.out.print(" "+digit);
        //     a=b;
        //     b=digit;

        // }

        // int n=123945;
        
        // int count=0;
        // while(n>0){
        //     n=n/10;
        //     count++;
        // }
        // System.out.println(count);
        // int a=10;
        // int b=20;

        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.println(a);
        // System.out.println(b);

        // String b="Java programming language";
        // String []v=b.split(" ");

        // String l=v[0];
        // String s=v[0];
        // for(String i: v){
        //     if(i.length()>l.length()){
        //         l=i;
        //     }
        //     if(i.length()<s.length()){
        //         s=i;
        //     }
        // }
        // System.out.println(l);
        // System.out.println(s);

        // String t="hellol";
        // for(int i=0;i<=t.length()-1;i++){
        //     char ch=t.charAt(i);
        //     if(t.indexOf(ch)==i){
        //         int count=0;
            
        //     for(int j=0;j<=t.length()-1;j++){
        //         if(t.charAt(j)==ch){
        //             count++;
        //         }
        //     }
        //     System.out.println(ch + "=" + count);
        //     }
           
        // }

        // String s="banaan";
        // for(int i=0;i<=s.length()-1;i++){
        //     char ch =s.charAt(i);
        //     if(s.indexOf(ch)==i){
        //         int count=0;
        //         for(int j=0;j<=s.length()-1;j++){
        //             if(s.charAt(j)==ch){
        //                 count++;
        //             }
        //         }
        //         System.out.println(ch +" = "+ count);
        //     }
        // }
        
        // String n="naveen";
        // for(int i=0;i<=n.length()-1;i++){
        //     char ch=n.charAt(i);
        //     if(n.indexOf(ch)==i){
        //         int count=0;
        //         for(int j=0;j<=n.length()-1;j++){
        //             if(n.charAt(j)==ch){
        //                 count++;
        //             }
        //         }
        //         System.out.println(ch + " " + count);
        //     }
        // }

        // String n="thunder";
        // int  c=n.length()-1;
        // char s=n.charAt(c);
        // System.out.println(s);

    //     String a="hello";
    //     // String[]v=a.split("");
    //     // char []ch=a.toCharArray();
   
    //         String d=a.replaceAll("[aeiou]","*");
    // System.out.println(d);
    // String s="java programming language";
    // String []v=s.split(" ");

 
    // int ch=s.charAt(0);
    // // String a=s.indexOf(0);
    // String q=ch.

    // String s="abcabcbb";
    // char c[]=s.toCharArray();
    // char t=c[0];
    // for(int i=0;i<=s.length()-1;i++){
    //     char ch=s.charAt(i);
    //     if(t==ch){
    //         System.out.println(ch);
    //     }
    // }

    // String n="naveen";
    // String v[]=n.split("");
    // for(int i=0;i<=n.length()-1;i++){
    //     for(int j=i+1;j<=n.length()-1;j++){
    //         if(v[i].equals(v[j])){
    //             System.out.println(v[i]);
    //         }
    //     }
    // }
    // String n="java programming language";
    // String s[]=n.split(" ");

    // for(String i:s){
    //     System.out.print(Character.toUpperCase(i.charAt(0))+i.substring(1)+" ");

    // }

    // String n="naveen";
    // String []spl=n.split("");
    // HashMap<String,String> map=new HashMap<>();

    // for(String i:spl){
    //     // map.put(spl[i],getOrDefault(spl[i],0)+1);
    //     System.out.print(i);
    // }
    
    // String s="a2b3v2";
    // for(int i=0;i<s.length();i=i+2){
    //     char c=s.charAt(i);
    //     char digit=s.charAt(i+1);
    //     int count=digit-'0';
    //     System.out.print(" ");
        
    //     for(int j=0;j<count;j++){
    //         System.out.print(c);
    //     }

    // }

//     String s="a1b12c13";
//     int i=0;
//    while(0<s.length()){
//     char ch=s.charAt(i);
//     i++;

//    }

// String s="madam";
// String temp=s;
// String v="";
// for(int i=s.length()-1;i>=0;i--){
//     char ch=s.charAt(i);
//     v=v+ch;
// }
// if(temp.equals(v)){
//     System.out.println(true);
// }
// else{
//     System.out.println(false);
// }

// String a="java";
// String c=("java");
// // 
// // String b=new String("java");



// System.out.println(a==c);
// System.out.println(a.equals(c));


// String name="i 123 am 672 god";
// String total="";
// int sum=0;

// String v[]=name.split(" ");
// for(String i:v){
//     if(Character.isDigit(i.charAt(0))){
//         sum=sum+Integer.valueOf(i);
//     }
//     else{
//         total=total+i+" ";
//     }
// }
// System.out.println(sum);
// System.out.println(total);

// int []n={50,10,70,30,100,90,80};
// int a=n[0];
// int b=n[1];

// for(int i=0;i<n.length;i++){
//     if(n[i]>a){
//         b=a;
//         a=n[i];

//     }
//     if(n[i]>b && a!=n[i]){
//         b=n[i];
//     }
    
// }
// System.out.print(b);

// int n[]={10,20,30,40,50};
// for(int i=n.length-1;i>=0;i--){
//     System.out.println(n[i]);
// }

// int []n={1,4,2,1,3,5,2,4,7};
// for(int i=0;i<=n.length-1;i++){
//     for(int j=i+1;j<=n.length-1;j++){
//         if(n[i]==n[j]){
//             System.out.println(n[i]);
//         }
//     }
// }

int n[]={1,6,0,0,3,0,9,5};
int v=n[0];
for(int i=0;i<n.length;i++){
    if(n[i]>v){
        System.out.println(n[i]);
    }
}

}
    

}