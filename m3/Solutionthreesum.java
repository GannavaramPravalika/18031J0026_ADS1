import java.util.Scanner;
import java.util.Arrays;
public class Solutionthreesum
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of the array");
         int n = sc.nextInt();
         int a[] = new int[n];
         System.out.println("Enter elements in to the array");
         for(int i=0;i<n;i++)
         {
        	 a[i] = sc.nextInt();
         }
         Threesum t = new Threesum();
         t.Arraysum(a);
	}
}
class Threesum
{
	public void Arraysum(int[] a)
	{
		Arrays.sort(a);
		int count = 0;
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					int x=a[i];
					int y=a[j];
					int z=a[k];
					if(x+y+z==0)
					{
						count++;
					}
				}
			}
		}
		System.out.println("The count of three sum which is 0 in the given array is: "+count);
	}

}
