package package1;

public class calculation2 {
	public int add(int a, int b)
	{
		int add=a+b;
		System.out.println("addition of two numbers = "+add);
		return  add;
	}
	public int add1(int a,int b)
	{
		int add1=a+b;
		System.out.println("addition of two number = " +add1);
		return add1;
		
	}
	public int sub(int a,int  b)
	{
		int sub=a-b;
		System.out.println("subtraction of two number = " +sub);
		return sub;
	}
	public int mult(int a,int b)
	{
		int mul=a*b;
		System.out.println("multiplication of two number = "+mul);
		return mul;
		
	}
	public int div(int a,int b)
	{
		int div=a/b;
		System.out.println("divide of two number = "+div );
		return div;
	}
	public static void main(String[] args) {
		calculation2 ref= new calculation2();
		int add=ref.add(10, 2);
		int add1=ref.add(add, 2);
		int sub=ref.sub(add1,2);
		int mul=ref.mult(sub,2);
		int div=ref.div(mul, 2);
		System.out.println("final result is "+div);
	}

}
