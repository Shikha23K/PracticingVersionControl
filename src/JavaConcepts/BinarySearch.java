package JavaConcepts;


import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
	
	int arr[]={23,4,6,7,34,63,78,89,22,15};
	int l=arr.length;
	int mid=arr.length/2;
	int begin=0;
	Arrays.sort(arr);
	for(int el:arr)
		System.out.print(el+" ");
	int key=22;
	while(true)
	{
		if(key==arr[mid])
			{System.out.println("Element is at "+(mid+1));
			break;}
		
		if(key<arr[mid])
			{l=mid;
			mid=l/2;
			}
		
		else if(key>arr[mid])
		{
			begin=mid;
			mid=(begin+l)/2;
		}
	
	}
		
	
	
	
	}

}
