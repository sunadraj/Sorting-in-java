package sorting;

public class Merge {
	
	public static void sort(int[] a)
	{
		if(a.length==1) return;
		int[] l=new int[a.length/2];
		int[] r=new int[a.length-l.length];
		int i;
		for (i=0;i<l.length;i++)
			l[i]=a[i];
		for(int j=0;j<r.length;j++) {
			r[j]=a[i];
			i++;
		}
		sort(l);
		sort(r);
		merge(l,r,a);
	}
public static void merge(int[] a,int[] b,int [] c) 
	{
		int i=0;int j=0;int k=0;
		while (i<a.length && j<b.length) 
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}
				else 
				{
					c[k]=b[j];
					j++;
					k++;
				}
		}			
		while(i<a.length) 
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		
		int[] a= {5,4,3,2,1};
		sort(a);
		for(int n:a)
			System.out.println(n);
	}

}
