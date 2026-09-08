import java.util.*;
public class interview {
    public static  void  main(String[]args){
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    
    // // for(int i=n;i>=0;i--){
    // //     System.out.println(i);
    // // }
    // int digit=0;
    // while(n>0){
    //     int rem=n%10;
    //     digit=(digit*10)+rem;
    //     n=n/10;
    // }
    // System.out.print(digit);

    // int n=121;
    // int temp=n;
    // int rev=0;
    // while(n>0){
    //     int value=n%10;
    //     rev=rev*10+value;
    //     n=n/10;
    // }
    // // System.out.println(rev);
    // if(temp==rev){
    //     System.out.println(true);
    // }
    // else{
    //     System.out.println(false);
    // }

    // int n=22;
    // int count=0;
    // for(int i=0;i<=n;i++){
    //     if(i%n==0){
    //         count++;
    //     }

        
    // }
    // if(count == 2){
    //     System.out.println(true);
    // }
    // else{
    //     System.out.println(false);
    // }

    // int n=5;
    // int mul=1;
    // for(int i=1;i<=n;i++){
    //     mul=mul*i;
    // }
    // System.out.println(mul);

    // int a=0;int b=1;
    // int n=7;
    // System.out.print(a +" "+b);
    // for(int i=2;i<=n;i++){

    //     int v=a+b;
    //     System.out.print(" "+v);
    //     a=b;
    //     b=v;
    // int []v={1,4,5};
    // // int []n=v.split("");
    // for(int i=v.length-1;i>=0;i--){
    //     System.out.println(v[i]);
    // }
        
    // int n[]={10 ,20 ,10 ,30 ,20 ,40};
    // for(int i=0;i<n.length;i++){
    //     for(int j=i+1;j<n.length;j++){
    //         if(n[i]==n[j]){
    //             System.out.println(n[i]);
    //         }
    //     }
    // }

    // int []n={1 ,2 ,3 ,2, 4 ,1 ,5};
    // int total=0;
    // for(int i=0;i<=n.length-1;i++){
    //     boolean not=false;
    //     for(int j=i+1;j<n.length;j++){
    //         if(n[i]==n[j]){
    //             not=true;
    //             break;
    //         }
    //         }
        
    //     if(!not){
            
    //         // total=total+n[i];
    //     System.out.println(n[i]);

    //     }
    //     Arrays.sort(n);
    // }
    // int []n={10 ,20 ,10 ,30 ,20 ,20,10,10 ,500,500,500,500,500,500,40 ,20, 20};
    // // int count=0;
    // int max=0;
    // int element=0;
    
    // for(int i=0;i<=n.length-1;i++){
    //     int count=0;
    //     for(int j=i+1;j<n.length;j++){
    //         if(n[i]==n[j]){
    //             count++;
    //         }
    //     }
    //     if(count>max){
    //         max=count;
    //         element=n[i];
            
    //     }


    // }
    // System.out.println(element);

    // String s="hello";
    // String []arr=s.split("");
    // String total="";
    // for(int i=arr.length-1;i>=0;i--){
    //     total=total+arr[i];

    // }
    // System.out.println(total);

    // String s="programming";
    // int count=0;
    // for(int i=0;i<s.length();i++){
    //     count++;
    // }
    // System.out.println(count);

    // String s="programming";
    // char []c=s.toCharArray();
    // for(int i=0;i<c.length;i++){
    //     boolean value=false;
    //     for(int j=i+1;j<c.length;j++){
    //         if(c[i]==c[j]){
    //     System.out.println(c[i]);
    //     return;
                
    //         }
    //     }
    // }
    Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // Set<Integer> v=new HashSet<>();
    // for(int i=0;i<n;i++){
    //     v.add(sc.nextInt());
    // }
    // System.out.println(v);

    // HashSet<Integer>Set=new HashSet<>();
    // for(int i=0;i<n;i++){
    //     Set.add(sc.nextInt());
        
    // }
    // for(int i=0;i<n;i++){
    //     if()
    // }

    // int a[]={1,2,3,4,5};
    // int b[]={3,4,5,6,7};

    // for(int i=0;i<a.length;i++){
    //     for(int j=0;j<b.length;j++){
    //         if(a[i]==b[j]){
    //             System.out.print(a[i]+" ");
    //         }
    //     }
    // }

    int a[]={10,20,30};
    int add=40;
    int v=a.length;
    
    
    a[v]=add;
    for(int i=0;i<v;i++){
        System.out.println(a[i]);
    }

}
}
