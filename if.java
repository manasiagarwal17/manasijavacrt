import java.util.*;
class division
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a,b;
a=s.nextInt();
b=s.nextInt();
if(b==0)
{
System.out.println("second cannot zero");
}
b=1;
int r=a/b;
System.out.println(r);
}
}