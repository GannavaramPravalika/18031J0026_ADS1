

import java.util.Scanner;

import java.util.NoSuchElementException;
import java.util.Stack;
class Studentdetails
{
	String rollno;
	String name;
	double total;
	public Studentdetails(String rollno, String name, double total) 
	{
		this.name = name;
		this.rollno = rollno;
		this.total = total;
	}
	public Studentdetails() {
		
	}
	
	public int compareTo(Studentdetails key) {
				if(this.name.equals(key.name))
				{
					return 0;
				}
				else if(this.name.compareTo(key.name)>0)
				{
					return 1;
				}
				else
				return -1;
	}
	
}


class Node
{
	Studentdetails key;
Node left,right;
int size;
public Node(Studentdetails key,int size) {
	
	this.key = key;
	this.size=size;
}
}
class Bstimp {
	
		Node root;
		
		
		void put(Studentdetails k)
		{
			//System.out.println("d");
			root=put(root,k);
		}
		Node put(Node x,Studentdetails k)
		{
			if(x==null)
			{
				//System.out.println("a");
				return new Node(k,1);
			}
			int cmp=k.compareTo(x.key);
			if(cmp<0) {//System.out.println("b");
				x.left=put(x.left,k);
			}
			else if(cmp>0)
			{//System.out.println("c");
				x.right=put(x.right,k);
			}
			else
				x.key=k;
				
			x.size=1+size(x.left)+size(x.right);
			return x;
		}

		Studentdetails get(String k,Node x)
		{
			
			while(x!=null)
			{
				
				int cmp=k.compareTo(x.key.name);
				if(cmp<0)
					x=x.left;
				else if(cmp>0)
					x=x.right;
				else
					return x.key;
			}
			return null;
		}

		public int size() {
		    return size(root);
		}
		private int size(Node x) {
		    if (x == null)
		    	return 0;
		    else return x.size;
		}

		public void inorderbe(double d1,double d2)
		{
			
		inorderbe(root,d1,d2);
	
			
		}
		public void inorderbe(Node n,double d1,double d2)
		{
			if(n==null)
				return;
			else
			{
				
			inorderbe(n.left,d1,d2);
			
			inorderbe(n.right,d1,d2);
			if(n.key.total>=d1 && n.key.total<=d2)
			{
				System.out.println(n.key.name);
			}
		
			}
		}
		public void inorderge(double d1)
		{
		inorderge(root,d1);
	
			
		}
		public void inorderge(Node n,double d1)
		{
			if(n==null)
				return;
			else
			{
				
			inorderge(n.left,d1);
			
		
			inorderge(n.right,d1);
			if(n.key.total>=d1 )
			{
				System.out.println(n.key.name);
			}
			}
			
		}
		
public void inorderle(double d1)
{
inorderle(root,d1);

	
}
public void inorderle(Node n,double d1)
{
	if(n==null)
		return;
	else
	{
		
	inorderle(n.left,d1);
	
	inorderle(n.right,d1);
	if(n.key.total<=d1 )
	{
		System.out.println(n.key.name);
	}
	

	}
}
}



 
public class Solution2pc
 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		Bstimp b=new Bstimp();
	String se=s.nextLine();
	String string[]=new String[n1];
	for(int i = 0;i<n1;i++)
	{
		String s1=s.nextLine();
		
		String s2[]=s1.split(",");
		Studentdetails sd=new Studentdetails(s2[0],s2[1],Double.parseDouble(s2[2]));
	b.put(sd);
	}

	int n2=s.nextInt();
	//String x=s.next();
	int c=0;
	for(int i = 0;i<n2+1;i++)
	{
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		switch(s2[0])
		{
		case "BE":double d1=Double.parseDouble(s2[1]),d2=Double.parseDouble(s2[2]);
		b.inorderbe(d1, d2);
			
			break;
		case "GE":
			double d11=Double.parseDouble(s2[1]);
			b.inorderge(d11);
			break;
		case "LE":
			double d111=Double.parseDouble(s2[1]);
			b.inorderle(d111);
			break;
		}
	}

	}

}
