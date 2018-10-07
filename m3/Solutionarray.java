import java.util.Scanner;
import java.util.Arrays;
class Sortedarray {
	public void Arraysort(int[] a1,int[] a2,int[] b)
	{
		Arrays.sort(a1);
		Arrays.sort(a2);
		Scanner sc = new Scanner(System.in);
		int N = a1.length;
		int M = a2.length;
		int K = b.length;
		int i=0,j=0,k=0;
		while(i<N)
		{
			b[k]=a1[i];
			i++;
			k++;
		}
		while(j<M)
		{
			b[k]=a2[j];
			j++;
			k++;
		}
		Arrays.sort(b);
		System.out.println("Common elements in both the arrays in sorted order");
		for(int y=0;y<K-1;y++)
		{
			if(b[y]==b[y+1])
			{
				System.out.print(b[y]+" ");
			}
		}
		
	}
	

}
class Solutionarray {
	public static void main(String[] args)
	{
		int n,m,o = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array1");
		n = sc.nextInt();
		System.out.println("Enter the size of array2");
		m = sc.nextInt();
		int a1[] = new int[n];
		int a2[] = new int[m];
		int b[] = new int[n+m];
		System.out.println("Enter the elements in to the array1");
		for(int i=0;i<n;i++)
		{
			a1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements in to the array2");
		for(int j=0;j<m;j++)
		{
			a2[j] = sc.nextInt();
		}
		Sortedarray sa = new Sortedarray();
		sa.Arraysort(a1,a2,b);
	}

}
