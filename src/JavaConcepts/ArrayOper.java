package JavaConcepts;

public class ArrayOper {

	public static void main(String[] args) {
		int arr[]= {13,78,34,20,19,43};
		System.out.print("Elements are : ");
		for(int el:arr)
			System.out.print(el+" ");
		
		//Minimum
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{	
			if(arr[i]<min)
				min=arr[i];
			
		}
		System.out.println("\nMinimum value  : "+min);
	
		//Maximum
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{	
			if(arr[i]>max)
				max=arr[i];
			
		}
		System.out.println("Maximum value  : "+max);
		
		//Summation
		
		int sum=0;
		for(int el:arr)
			sum+=el;
		System.out.println("Summation of all element :  "+sum);
		
		//Percentage of Marks of 5 subject on 100
		
		int marks[]= {67,91,76,49,89},total=0;
		System.out.print("Marks are : ");
		for(int el:marks)
			System.out.print(el+" ");
		
		for(int el:marks)
			total+=el;
		
		double per=(double)total/5;
		System.out.println("\nPercentage of Marks : "+per+" %");
		
		
		//searching an element
		int key=19,at=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==key)
				{flag=true;
				at=i;
				break;						
				}
			else
				flag=false;
		if(flag==true)
			System.out.println(key+" is found at "+(at+1));
		else
			System.out.println("Sorry we couldn't find value "+key);
	
		//Sorting
		//13,78,34,20,19,43
		int temp=0;
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
							
				if(arr[i]>arr[j])
					{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				
		
		for(int el:arr)
			System.out.print(el+" ");

	}

}
