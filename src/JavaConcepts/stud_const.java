package JavaConcepts;
import java.util.ArrayList;
import java.util.Scanner;
class student
{
	ArrayList<String> name=new ArrayList<>();
	int []marks=new int[5];
	String stud_name;
	int roll;
	char grade;
	
	void getVal()
	{
		String nam;
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three names  :");
		for(int i=0;i<3;i++)
		{	
			nam=sc.nextLine();
			name.add(nam);
		}
		System.out.println("Enter marks of 5 subject : ");
		for(int i=0;i<5;i++)
		{	
			marks[i]=sc.nextInt();
			
		}		
	}	
	student()
	{
		stud_name="Suresh";
		roll=78;
		grade='A';
		getVal();
	}
	student(String n,int r, char g)
	{
		stud_name=n;
		roll=r;
		grade=g;
		getVal();
	}
	void display() {
		System.out.println("All name list "+name);
		System.out.println("Student name  : "+stud_name);
		System.out.println("Student roll  : "+roll);
		System.out.println("Student grade  : "+grade);
		System.out.println("Marks : ");
		for(int m:marks)
			System.out.println(m);
	}
	
}
public class stud_const {
	public static void main(String[] args) {
		student obj=new student();
		obj.display();
		
		student obj1=new student("Ramesh",56,'B');
		obj1.display();
	}
}



















