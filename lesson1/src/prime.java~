import java.util.Scanner;
public class prime{
	public static void main(String[] args){  // the only main entry, depend on class User,Tools; javac many java one;
		User user1 = new User("I am the args for User constructor");
		user1.sayContent();
		Tools tool1 = new Tools("hammer");
		tool1.giveTool();
		System.out.println("helloworld");
		
		// Promblem1: create all primes smaller than n;
			//method1:
            //input
            System.out.println("you want to get all the primes blow what?");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            //doSomething
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
            System.out.println("please tell us how many primes you want to get");
            int innum = in.nextInt();
			int[] array = new int[innum];
			for( int i = 0; i<array.length; i++)
			{
				array[i]=0;
			}
			
			//doSomething
			array[0]=2;
			int cnts = 1;
			Maincycle1:
			for(int k=array[cnts-1]+1; cnts<innum; k+=2)
			{
				for(int m=0; m<cnts; m++)
				{
					if( k%array[m]==0 )
					{
						continue Maincycle1;
					}
				}
				array[cnts]=k;
				cnts++;
			}

			//output
            System.out.println("here you go");
			for( int i = 0; i<array.length; i++)
			{
				System.out.println(array[i]);
			}
	}
}
