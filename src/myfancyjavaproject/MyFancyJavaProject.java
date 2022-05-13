
class Testfactory
{
	
	static int gcd(int c, int d)
	{
		
		if (c == 0)
		return b;
		if (d == 0)
		return a;
	
	
		if (c == d)
			return c;
	
		if (c > d)
			return gcd(c-d, d);
		return gcd(c, d-c);
	}
	
	
	public static void main(String[] args)
	{
		int c = 98, d = 56;
		System.out.println("GCD of " + c +" and " + d + " is " + gcd(c, d));
	}
}
