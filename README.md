import java.util.HashSet;
class m4{
    public static void main(String[] args){
      int arr[]={23,3,3,4,4,4,5,5};
      HashSet<Integer> set=new HashSet<>();
      for(int num:arr){
        set.add(num);
      }
      System.out.println(set);
    }
}
