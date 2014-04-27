/*
Problem Statement:
https://www.hackerrank.com/challenges/handshake

At the annual meeting of Board of Directors of Acme Inc, every one starts shaking hands with everyone else in the room. Given the fact that any two persons shake hand exactly once, Can you tell the total count of handshakes?

Input Format
The first line contains the number of test cases T, T lines follow.
Each line then contains an integer N, the total number of Board of Directors of Acme.

Output Format

Print the number of handshakes for each test-case in a new line.

Constraints

1 <= T <= 1000
0 < N < 10^6
*/

import java.io.*;



class Handshake
{
	public static void main(String args[]) throws Exception
	{
		int noOfTC = 0;
		long noOfPeopleArray[];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
//			System.out.println("Number of TCs: ");
			noOfTC = Integer.parseInt(br.readLine());
		} while(noOfTC < 1 || noOfTC > 1000);

		noOfPeopleArray = new long[noOfTC];

		for(int i=0; i < noOfTC; i++)
		{
			do {
//				System.out.println("Number of TCs: ");
				noOfPeopleArray[i] = Long.parseLong(br.readLine());
			} while(noOfPeopleArray[i] < 0 || noOfPeopleArray[i] > 1000000);
		}

		for(int i=0; i < noOfTC; i++)
		{
			long result = 0;	//Trick: result = (noOfPeople * (noOfPeople - 1)) / 2	=> the multiplication here can yeild a really big number
						//Another trick: if noOfPeople is even, then ((noOfPeople) * (noOfPeople/2)) - (noOfPeople/2)
								//else	(noOfPeople) * (noOfPeople/2)
			
			if(noOfPeopleArray[i] != 1)	//trivial case
			{
				long multiplier = noOfPeopleArray[i] / 2;
				result = noOfPeopleArray[i] * multiplier;
				if(noOfPeopleArray[i] % 2 == 0)		//if even, subtract the multiplier from result
				{
					result = result - multiplier;
				}
			}
			System.out.println(result);


		}
	}
}
