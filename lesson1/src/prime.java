public class prime{
	public static void main(String[] args){  // the only main entry, depend on class User,Tools; javac many java one;
		User user1 = new User("I am the args for User constructor");
		user1.sayContent();
		Tools tool1 = new Tools("hammer");
		tool1.giveTool();
		System.out.println("helloworld");
		
		// Promblem1: create all primes smaller than n;
			//method1:
			int n = 100;
			int cnt = 1;
			System.out.println('2');
			Maincycle:
			for(int i=3; i<n; i+=2)
			{
				for(int k=3; k<=Math.sqrt(i); k++)
				{
					if(i%k == 0)
					{
						continue Maincycle;
					}
				}
				cnt++;
				System.out.println(i);
			}
			System.out.println();
			System.out.println("we have "+cnt+"primes smaller than 100");
		
		// Promblem2: create n primes in ammount.
			//method1:
			//input
			int[] array = new int[100];
			for( int i = 0; i<array.length; i++)
			{
				array[i]=0;
			}
			
			//doSomething
			array[0]=2;
			int cnts = 1;
			Maincycle1:
			for(int k=3; array.length<100; k+=2)
			{
				for(int m=0; m<array.length; m++)
				{
					if( k%array[m]==0 )
					{
						continue Maincycle1;
					}
				}
				System.out.println(k)
				array[cnts]=k;
				cnts++;
			}

			//output
			for( int i = 0; i<array.length; i++)
			{
				System.out.println(array[i]);
			}
	}
}
