import java.util.Arrays;
import java.util.Date;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,12,22,141,5666};
		Long d1=new Date().getTime();
		System.out.println(d1);
		if(arr.length>1) {
			quick(arr,0,arr.length-1);
		}
		Long d2=new Date().getTime();
		System.out.println(d1);
		System.out.println(Arrays.toString(arr)+"-"+(d2-d1));
		
	}
	
	public  static void quick(int[] arr,int i,int j ) {
		if(j<=i) {
			return;
		}
		int flag=arr[i];
		int i1=i;
		int j1=j;

		
		while(i<j) {
			while(i<j&&arr[j]>=flag) {
				j--;
			}
			while(i<j&&arr[i]<flag) {
				i++;
			}
			int flag2=arr[i];
			arr[i]=arr[j];
			arr[j]=flag2;
			
		}
		if(arr[i]<flag) {
			int flag2=arr[i];
			arr[i]=flag;
			
			flag=flag2;
			
			 
		}
		
		quick(arr,i1,i);
		quick(arr,i+1,j1);
		
	}
	
}