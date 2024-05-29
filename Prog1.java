package InterviewProgs;

//Print 1 to 100 without using any numbers in your code

public class Prog1 {
	
	public static void main(String[] args) 
	{
		int one='A'/'A';
		String size="..........";
		
		for(int i=one;i<=(size.length()*size.length());i++)
		{
			System.out.println(i);
		}
		printNum(1);
		
	//0/0--airthmatic exception
	//1..588/0-infinity
	//0.0000/0-infinity
	//4.58988/0-infinity
		
		
	}
	

	//Print 1 to 100 without using for/while/do while loop using recursive
	public static void printNum(int num) 
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNum(num);
		}
		
	}

}
