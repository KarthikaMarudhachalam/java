package java.Games;
public class Arrrloop {
  public static void main(String[] args) {
    int num[]=new int[5];
    num[0]=1;
    num[1]=2;
    num[2]=3;
    num[3]=4;
    num[4]=5;

    // for(int i=0;i<num.length;i++)
    // {
    //   System.out.println(num[i]);
    // }

    for(int n : num)
    {
      System.out.println(n);
    }
  }
}
