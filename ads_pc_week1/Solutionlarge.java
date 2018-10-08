
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;

class AddLargeNumbers1
{ 
	static LinkedList<Integer> obj =new  LinkedList<Integer>();

public static LinkedList numberToDigits(String a1) 
{
	long a2=Integer.parseInt(a1);
	for(int i=0;i<a1.length();i++)
	 {
		 int s=(int) (a2%10);
		 obj.add(s);
		 a2=a2/10;
	 }
	return obj; 
}

public static String[] digitsToNumber(LinkedList obj) 
{
	String str[] = null;
	 
	Iterator<Integer> itr=obj.iterator();
	 for(int i=0;i<obj.size();i++)
	 {
	str[i]=Integer.toString(itr.next());
	 }
	return str;

    
}
public static LinkedList addLargeNumbers(LinkedList obj1, LinkedList obj2) 
{
	Stack<Integer> st1=new Stack<Integer>();
	Stack<Integer> st2=new Stack<Integer>();
	LinkedList<Integer> st3=new LinkedList<Integer>();
	for(int i=0;i<obj1.size();i++)
	{
		st1.push(obj.get(i));
	}
	for(int i=0;i<obj2.size();i++)
	{
		st2.push(obj.get(i));
	}
	while(st1.isEmpty()||st2.isEmpty())
	{
		while(st1.pop()+st2.pop()<10)
		{
		st3.add(st1.pop()+st2.pop());
		}
		
			int x=st1.pop()+st2.pop();
			st3.add(x%10);
			x=x/10;
			st3.add(st1.pop()+st2.pop()+(x%10));
			}
	return st3; 
 }
}

public class Solutionlarge {

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	        
		 String input = sc.nextLine();
		        
		  String p = sc.nextLine();
		         
		 String q = sc.nextLine();
		        
		 switch(input){
		            
		  case "numberToDigits":
		                 
		 LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
		                
		  LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
		                
		  System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
		                
		 System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
		                
		  break;

		           
		   case "addLargeNumbers":
		                
		  LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
		                
		  LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
		                 
		 LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1 );
		                
		  System.out.println(AddLargeNumbers.digitsToNumber(result));
		                
		  break;
		        
		  }
		     

	}

}
