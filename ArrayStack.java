import java.util.*;
class MyStack
{
	int a[];
	int size;
	int top;
	MyStack(int n)
	{
	   top=-1;
	   size=n;
	   a=new int[n];
	}
	
	void push(int x)
	{
	   if(top==size-1)
	   {
		System.out.println("Stack is overflow");
		return;
	   }
	   top++;
	   a[top]=x;
	}
	void pop()
	{
	   if(top==-1)
	   {
		System.out.println("Stack is underflow");
		return;
	   }
	   System.out.println(a[top]+"is deleted");
	   top--;
	   
	}
	void display()
	{
	   if(top==-1)
	   {
	   	System.out.println("Stack is empty");
		return;
	   }
	   for(int i=top;i>=0;i--)
	   {
		System.out.print(a[i]+" ");
	   }
	}
}
class ArrayStack
{
	public static void main(String args[])
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter size of Stack:");
	   int n=s.nextInt();
	   MyStack s1=new MyStack(n);
	   for(;;)
	   {
		System.out.println();
		System.out.println("1.PUSH\n2.POP\n3.PRINT\n4.EXIT");
		System.out.println("Enter your choice:");
		int ch=s.nextInt();
		if(ch==1)
		{
		   System.out.println("Enter An element");
		   int x=s.nextInt();
		   s1.push(x);
		}
		else if(ch==2)
		{
			s1.pop();
		}
		else if(ch==3)
		{
			s1.display();
		}
		else if(ch==4)
		{
			break;
		}
		else
		{
			System.out.println("invalid choice");
		}
	   }
	}
}



/*output:*/
Enter size of Stack:
4

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
11
Stack is overflow

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
4
Stack is overflow

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
4

C:\Users\Admin\Desktop\java>javac ArrayStack.java

C:\Users\Admin\Desktop\java>java ArrayStack
Enter size of Stack:
4

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
11

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
12

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
13

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
14

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
15
Stack is overflow

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
3
14 13 12 11
1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
2
14is deleted

1.PUSH
2.POP
3.PRINT
4.EXIT
Enter your choice:
4


