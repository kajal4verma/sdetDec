package package1;
public class calculation {
	public int multiply(int a ,int b) {
		int mul=a*b;
		System.out.println("multiplication of two number =" +mul );
		return mul;
	}
	public int sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("subtraction of two number = " + sub);
		return sub;
	}
	public int sum(int a, int b)
	{
		int sum;
		sum=a+b; 
		System.out.println("sum of two number = " + sum);
		return sum;		
	}	
	public int finalsub(int a, int b)
	{
		int sub;
		sub=a-b;
		System.out.println("final subtraction of two number = " + sub);
		return sub;		
	}	
	public void div(int a,int b) {
		int div=a/b;
	    System.out.println("divison of two number = " +div);
	    System.out.println("final result is = " +div);
	}	
	public static void main(String[] args) {
		calculation refvar=new calculation();
		int multiplyresult=refvar.multiply(10,2);
		int subresult=refvar.sub(multiplyresult, 2);
		int sumresult =refvar.sum(subresult, 2);
		int finalSubResult=refvar.finalsub(sumresult, 2);
		refvar.div(finalSubResult, 2);
	}
}
