class Calculator
{
		public void add(int a,int b)
		{
		int c;
		c=a+b;
			System.out.println(c);
		}
		public void add(double a,int b)
		{
		 double c ;
		c=a+b;
			System.out.println(c);
		}
		public void add(int a,int b)
		{
		 int c=a+b;
			System.out.println(c);
		}
		public void add(double a,double b)
		{ 
		double c;
		c=a+b;
			System.out.println(c);
		}	
			public void add(String a,String b)
		{ 
		String c;
		c=a+b;
			System.out.println(c);
		}	
}
class MainCalculator
{
		public static void main(String[] args)
		{
	     	Calculator tol=new Calculator();
	        tol.add(1,2);
			tol.add(7.00,5);
			tol.add(9.00,2);
			tol.add(2.500,2.978);	
			tol.add("Murthy","Mukkavilli");			
			
		}
}