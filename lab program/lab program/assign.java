class assign
{
	public static void method1(int a, int b,int c)
	{
		c = a+b;
		System.out.println("assignment operators are");
		System.out.println("c = " + c);
		
		c += a;
		System.out.println("c += " + c);
		
		c -= a;
		System.out.println("c -= " + c);
		
		c *= a;
		System.out.println("c *= " + c);
		
		c /= a;
		System.out.println("c /= " + c);
		
		c %= a;
		System.out.println("c %= " + c);
		
	}
	public static void method2(int a)
	{
		System.out.println("------------unary operator------");
		System.out.println("the value of a is :" + a);
		System.out.println("post increment of a is:" + a++);
		System.out.println("post decrement of a is:" + a--);
		System.out.println("pre  decrement of a is:" + --a);
		System.out.println("pre  increment of a is:" + ++a);
		System.out.println(" ");
		
		
		
		
	}
		
	
	public static void method1(int a,int b)
	{
		System.out.println("relational operators are");
		System.out.println("a is " + a  + " and b  is " + b);
		System.out.println( a == b);
		System.out.println( a != b);
		System.out.println( a > b);
		System.out.println( a < b);
		System.out.println( a >= b);
		System.out.println( a <= b);
	}
	
    public static void method2(int a, int b , int c)
	{
		System.out.println("------------Logical Operator-----");
		boolean value1=(a>b)&&(b<c)&&(c>a);
		System.out.println(" the value1 is :" +value1);
		
		boolean value2=(a<b)||(b<c)|| (c>a);
		System.out.println(" the value2 is :" +value2);
		
		boolean value3=(a>b)&&(b>c)||(a==b)&&(c>a);
		System.out.println(" the value3 is :" +value3);
		
		boolean value4=(!(a>c));
		System.out.println(" the value4 is :" +value4);
		System.out.println(" ");
	
	
	}
		
		
		public static void main(String[]args)
		{
			method1(7,11);
			method1(10,20,0);
			method2(20);
			method2(10,30,50);
		}
	
}