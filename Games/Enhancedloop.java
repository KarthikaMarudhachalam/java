package java.Games;

public class Enhancedloop
{
    public static void main(String a[])
    {
        int num[][][]=new int[3][4][5];
        {
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<4;j++)
                {
                    for(int k=0;k<5;k++)
                    {
                        num[i][j][k]=(int)(Math.random()*10);
                    }
                }
            }
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<4;j++)
                {
                    for(int k=0;k<5;k++)
                    {
                        System.out.print(num[i][j][k] + " ");
                    }
                    System.out.println();
                }
                for(int[][] n : num)
                {
                    for(int[] m : n)
                    {
                        for(int l : m)
                    
                    {
                        System.out.print(l + " ");
                    }
                    System.out.println();
                }
                }
            }
           
        }
    }
}
