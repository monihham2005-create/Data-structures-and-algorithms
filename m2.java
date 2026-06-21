public class m2{
    public static void main(String[] args){
         int arr[]={83,54,2,3,4455,34};
         int largest=Integer.MIN_VALUE;
         int secondlargest=Integer.MIN_VALUE;
         for(int num:arr){
            if(num>largest){
                secondlargest=largest;
                largest=num;
            }
            else if(num > secondlargest && num != largest){
                     secondlargest=num;

            }
         }
         System.out.println("The second largest number is="+ secondlargest);

    }
}