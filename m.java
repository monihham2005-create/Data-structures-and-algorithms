public class m{
    public static void main(String[] args) {
        int arr[]={10,20,45,56,68};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("The largest number="+max);
    }
}
