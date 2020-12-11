class Pattern
{
  public static void main(String[] args)
  {

// 1 to 5
    for(int i=1;i<=5;i++)
     {    
       for(int j=1;j<=i;++j)
       {
        System.out.print("*");
       }
      System.out.println();
     }
// 4 to 1
    for(int i=4;i>=1;i--)
     {    
       for(int j=1;j<=i;++j)
       {
        System.out.print("*");
       }
      System.out.println();
     }
  }
}