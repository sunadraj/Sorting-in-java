package sorting;

public class QuickSort {

	public static void quickSort(int[] a,int l,int h) {
		int i=l;int j=h;
		int pivot=a[(l+h)/2];
		while(i<=j) {
			while(a[i]<pivot) 
				i++;
			while(a[j]>pivot)
				j--;
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		if(l<j)
			quickSort(a,l,j);
		if(i<h)
			quickSort(a,i,h);
	
	}
	public static void main(String[] args) {
		int[] arr= {4,1,3,5,8,7,6};
		quickSort(arr,0,arr.length-1);
		for(int n:arr)
			System.out.println(n);
		
	}

}
