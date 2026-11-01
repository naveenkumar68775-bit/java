class naveen{
    public static void main(String[]args){
        int n[]={1,2,2,3,4,5,6,6,6};
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length;j++){
                if(n[i]==n[j]){
                    System.out.println(n[i]);
                }

            }
        }
    }
}
