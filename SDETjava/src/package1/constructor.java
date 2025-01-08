package package1;

public class constructor {

	public constructor()
	{ 
		this(1,8,9);
		System.out.println("default constructor");
	}
	public constructor(int a)
	{
		this();
		System.out.println("one parameter constructor");
	}
	public constructor(int a,int b) {
		this(1);
		System.out.println("two parameter constructor");
	}
	public constructor(int a,int b,int c)
	{
		System.out.println("three parameter constructor");
	}
	public static void main(String[] args) {
//		System.out.println("main ");
		constructor ob=new constructor(2,3);
	}
	
	

}
