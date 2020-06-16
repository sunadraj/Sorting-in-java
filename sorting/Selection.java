package sorting;

public class Selection {

	public static void selectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[index]>a[j])
				{
					index=j;
				}
				if(index!=i)
				{
					int temp=a[i];
					a[i]=a[index];
					a[index]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] a= {5,4,3,2,1};
		selectionSort(a);
		for(int n:a)
			System.out.println(n);
		
	}
}
