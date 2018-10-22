
public class stque{
	//node class
	Node head;
	class Node
	{
		int data;
		Node next;
	}
	//creating method for inserting a element
	public void push(int p)
	{
		//creating a new node
		Node n=new Node();
		//send the data to the node
		n.data=p;
		n.next=null;
		//traversing through the list
		if(head!=null)
		{
			n.next=head;
		}
		head=n;
	}
	//method for removing the element
	public void pop()
	{
		//creating a temporarary node
		Node t=head;
		head=t.next;
	}
	//method to add an element at the end 
	public void enque(int r)
	{
		Node n1=new Node();
		n1.data=r;
		n1.next=null;
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n1;
	}
	public void display()
	{
		Node t1=head;
		while(t1.next!=null)
		{
			System.out.println(t1.data);
			t1=t1.next;
		}
		System.out.println(t1.data);
	}
	public static void main(String args[])
	{
		stque st=new stque();
		st.push(10);
		st.push(15);
		//st.display();
		st.push(45);
		//st.display();
		st.pop();
		//st.display();
		st.enque(35);
		//st.display();
		st.enque(84);
		st.display();
	}
	
	
	
	

}
