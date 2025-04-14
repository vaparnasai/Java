class PrimeNoFromOneToThousand 
{
	public static void main(String[] args) 
	{
		int n =1000;
		boolean isPrime = true;
		for (int i = 2; i<n ;i++ )
		{
			if (n%i==0)
			{
				isPrime = false;
				break;
			}
		}
		if (isPrime == true)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
}
