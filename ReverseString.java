class ReverseString
{
  public static void main(String args[])
  {
    String a = "Mississippi";
    char[]a1 = a.toCharArray();
    char temp;

    for(int i=0, j=a1.length-1; i<=j; i++,j--)
    {
     temp=a1[i];
     a1[i]=a1[j];
     a1[j]=temp;
    }
    for(char a2:a1)
    {
      System.out.print(a2);
    } 	
  }
}