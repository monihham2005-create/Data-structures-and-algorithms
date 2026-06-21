class new{
    public static void main(String[] args) {
        int arr[]={10,20,45,56,68};
        int max=arr[0];
        for(int i=arr.length;i>=0;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("The largest number="+max);
    }
}
