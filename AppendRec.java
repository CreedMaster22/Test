public class AppendRec{

  public static void main(String [] args){
    System.out.println(appendNTimes("Cats", 0));

  }


  public static String appendNTimes(String original, int n){
    if(n == 0)
      return original;
    return original + appendNTimes(original, n - 1);
  }






}
