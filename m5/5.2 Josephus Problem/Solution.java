import java.util.LinkedList;
import java.util.Scanner;
public class Solution 
{
	public static void main(String[] args)
	{
	LinkedList<Integer> l = new LinkedList<>();
	Scanner sc = new Scanner(System.in);
	int a =  sc.nextInt();
	for(int i =0; i<a; i++)
	{
		int m = sc.nextInt();
		int n = sc.nextInt();
	for(int j=0; j<m ;j++)
	{
		l.add(j);
	}
	int temp = 0;
	temp = (temp+n-1)%l.size();
	System.out.print(l.get(temp));
	l.remove(temp);
	while(l.size() != 0)
	{
		temp = (temp+n-1)%l.size();
		System.out.print(" "+l.get(temp));
		l.remove(temp);
	}
	System.out.println( );
	}
	
	}
}
