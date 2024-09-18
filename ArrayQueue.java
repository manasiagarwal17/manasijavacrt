import java.util.*;
class MyQueue
{
	int a[];
	int size;
	int front,rear;
	MyQueue(int n)
	{
	   front=-1;
	   rear=-1;
	   size=n;
	   a=new int[n];
	}
	
	void enQueue(int x)
	{
	   if(rear==size-1)
	   {
		System.out.println("Queue is full");
		return;
	   }
	   rear++;
	   a[rear]=x;
	}
	void deQueue()
	{
	   if(front==rear)
	   {
		System.out.println("Queue is empty");
		return;
	   }
	   front++;
	   System.out.println(a[front]+"is deleted");
	   
	}
	void display()
	{
	   if(front==rear)
	   {
	   	System.out.println("Queue is empty");
		return;
	   }
	   for(int i=front+1;i<=rear;i++)
	   {
		System.out.print(a[i]+" ");
	   }
	}
}
class ArrayQueue
{
	public static void main(String args[])
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter size of Stack:");
	   int n=s.nextInt();
	   MyQueue s1=new MyQueue(n);
	   for(;;)
	   {
		System.out.println();
		System.out.println("1.Enqueue\n2.Dequeue\n3.PRINT\n4.EXIT");
		System.out.println("Enter your choice:");
		int ch=s.nextInt();
		if(ch==1)
		{
		   System.out.println("Enter An element");
		   int x=s.nextInt();
		   s1.enQueue(x);
		}
		else if(ch==2)
		{
			s1.deQueue();
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

1.Enqueue
2.Dequeue
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
12

1.Enqueue
2.Dequeue
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
13

1.Enqueue
2.Dequeue
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
14

1.Enqueue
2.Dequeue
3.PRINT
4.EXIT
Enter your choice:
3
12 13 14
1.Enqueue
2.Dequeue
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
11

1.Enqueue
2.Dequeue
3.PRINT
4.EXIT
Enter your choice:
1
Enter An element
56
Queue is full

1.Enqueue
2.Dequeue
3.PRINT
4.EXIT
Enter your choice:
2
12is deleted

1.Enqueue
2.Dequeue
3.PRINT
4.EXIT
Enter your choice:
4

