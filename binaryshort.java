public class binaryshort
{
	public static void main(String arg[])
	{
	 int a[]={1,2,3,4,5,8,9,10};
	 int y;
	 int num;
	 int x=a.length;
	 y=1+x/2;
	 while(a[y]<10)
	 {
	 y++;
	 if(a[y]==10)
	 System.out.println(y+1);
	 }
	 while(a[y]>10)
	 {
	  y--;
	  if(a[y]==10)
 	  System.out.println(y+1);
	}
	}
}