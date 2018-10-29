
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

class Solution {
	static void Quicksort(ArrayList<Student> al) {
		// TODO Auto-generated method stub
		
	}
	int partition(ArrayList<Student> a,int lo,int hi)
	{
		int i = lo, j = hi+1;   
		while (true)   
		{       
			while (less(a.get(++i), a.get(lo))) 
			     if (i == hi)
			    	 break; 
	      while (less(a.get(lo), a.get(--j)))
	    	  if (j == lo)
	    		  break; 
	      if (i >= j)
	    	  break;   
	      exch(a, i, j);    } 
	      exch(a, lo, j);   
	   return j; 
	}
	private static boolean less(Student a, Student b) 
	{
     //System.out.println("hi");
		//return a.compareTo(b);
		if(a.t==b.t)
		{
			if(a.m3==b.m3)
			{
				if(a.m2==b.m2)
				{
					if(compareToDob(a.dob,b.dob)<0)
					{
						//System.out.println("hi");
						return false;
					}
					return true;
				}
				else if(a.m2<b.m2)
					return false;
					else
						return true;	
				}
			else if(a.m3<b.m3)
				return false;
			else
				return true;
				}
		else if(a.t<b.t)
			return false;
			else 
			return true;
			}
	private static int compareToDob(String dOB, String dOB2) {
		String[] a=dOB.split("-");
		String[] b=dOB2.split("-");
		if(Integer.parseInt(a[2])==Integer.parseInt(b[2]))
		{
			if(Integer.parseInt(a[1])==Integer.parseInt(b[1]))
			{
				if(Integer.parseInt(a[0])>Integer.parseInt(b[0]))
					return 1;
				else
					return -1;
			}
			if(Integer.parseInt(a[1])>Integer.parseInt(b[1]))
				return 1;
			else
				return -1;
		}
		if(Integer.parseInt(a[2])>Integer.parseInt(b[2]))
			return 1;
		else
			return -1;		
	}
	 private static void exch(ArrayList<Student> a, int i, int j) {
	        Object swap = a.get(i);
	        a.set(i, (Student)a.get(j)); 
	        a.set(j, (Student) swap);
	        
	    }
	void sort(ArrayList<Student> a,int lo,int hi)
	{
		//System.out.println("fnhgbtg");
		if(lo<hi)
		{
			int p=partition(a,lo,hi);
			sort(a,lo,p-1);
			sort(a,p+1,hi);
		}
	}
	 public static void show(ArrayList<Student> al) {
		 for(Student t:al)
		    {
		        System.out.println(t.name+","+t.dob+","+t.m1+","+t.m2+","+t.m3+","+t.t);
		    }
}
}

public class Quicksort
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{   
		
		ArrayList<Student> al=new ArrayList<Student>();
		/*al.add(new Student("Ajay","12-6-1993",32,33,11,76));
		al.add(new Student("priya","13-8-1993",21,40,11,72));
		al.add(new Student("rahul","22-10-1993",34,19,19,72));
		al.add(new Student("abhisek","06-05-1993",18,37,15,70));
		al.add(new Student("priyanka","9-12-1993",18,37,15,70));
		al.add(new Student("vani","13-06-1993",11,23,16,50));*/
		Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
		String a="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while((a=br.readLine())!=null)
		{
			if(a.length()>2)
			{
			//String a=sc.nextLine();
			//System.out.println(a);
			String[] b=a.split(",");
			//System.out.println(b[0]);
			al.add(new Student(b[0],b[1],Integer.valueOf(b[2]),Integer.valueOf(b[3]),Integer.valueOf(b[4]),Integer.valueOf(b[5])));
			Quicksort q=new Quicksort();
			q.sort(al,0,al.size()-1);
			}else
			{
				break;
			}
			
			
		}
		//Collections.sort(al);
		Quicksort q=new Quicksort();
		q.show(al);
	}

	
}

class Student 
{
String name;
int m1,m2,m3,t;
String dob;
Student(String name,String dob,int m1,int m2,int m3,int t)
{
	this.name=name;
	this.dob=dob;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.t=t;
	//System.out.println(d);
}

	}
	


