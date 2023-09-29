package vaiables;

public class Add {
		public static void main(String... args){
		int a=11,b=17,c=30,d=43,e=51,f=60;
		int sum=+b+c+d+e+f;
		System.out.println("add all="+(a+b+c+d+e+f));
		System.out.println("subract all="+(a-b-c-d-e-f));
		System.out.println("multiple all="+(a*b*c*d*e*f));
		System.out.println("division of a&b="+a/b);
		System.out.println("moduls of c&d="+c%d);
		System.out.println("==================================");

		if(sum%2==0)
		{
			System.out.println(" sum is even");
			System.out.println("==================================");
		}
		else{
			System.out.println(" sum is odd ");
			System.out.println("==================================");
		}
		if(b<=10)
		{
			System.out.println("b is lesser than or equal to ten");
			System.out.println("==================================");
		}
		else{
			System.out.println("b is not less than or equal to10");
			System.out.println("==================================");
		}
		if((a+b+c+d)==4)
		{
			System.out.println("total value equal to 4 ");
			System.out.println("==================================");
		}
		else{
			System.out.println("total value is not  equal to 4");
			System.out.println("==================================");
		}
		}
}
