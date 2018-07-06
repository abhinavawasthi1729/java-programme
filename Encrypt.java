public class Encrypt{
public static void main(String args[])
{
 String pt="This string",ct="",ect="";
 int t[]={1,2,3,4},c;
//int x=Integer.praseint(args[1]);
 for(int i=0;i<(pt.length());i++)
 {
  c=i%4;
  ct=ct+(char)(pt.charAt(i)+t[c]);
 }
 System.out.println(ct);
 for(int j=0;j<ct.length();j++)
 {
 c=j%4;
 ect=ect+(char)(ct.charAt(j)-t[c]);
 }
System.out.println(ect);
}
}