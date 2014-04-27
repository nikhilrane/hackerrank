/*
Problem Statement:
https://www.hackerrank.com/challenges/halloween-party

Alex is attending a Halloween party with his girlfriend Silvia. At the party, Silvia spots a giant chocolate bar. If the chocolate can be served as only 1 x 1 sized pieces and Alex can cut the chocolate bar exactly K times, what is the maximum number of chocolate pieces Alex can cut and give Silvia?

Input Format
The first line contains an integer T denoting the number of testcases. T lines follow.
Each line contains an integer K

Output Format
T lines. Each containing the output corresponding to the testcase.

Constraints
1<=T<=10
2<=K<=10^7
*/

import java.io.*;



class HalloweenParty
{
	public static void main(String args[]) throws Exception
	{
		int noOfTC = 0;
		long cutsArray[];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
//			System.out.println("Number of TCs: ");
			noOfTC = Integer.parseInt(br.readLine());
		} while(noOfTC < 1 || noOfTC > 10);

		cutsArray = new long[noOfTC];

		for(int i=0; i < noOfTC; i++)
		{
			do {
//				System.out.println("Number of TCs: ");
				cutsArray[i] = Long.parseLong(br.readLine());
			} while(cutsArray[i] < 0 || cutsArray[i] > 10000000);
		}

		for(int i=0; i < noOfTC; i++)
		{
			long result = 0;		//Trick: divide the number of cuts in input by 2 (as 1x1 are only allowed), and multiply each other
                                   		//also handle odd number of cuts
			
			result = cutsArray[i] / 2;
			if(cutsArray[i] % 2 == 1)
			{
				result++;
			}
			
			System.out.println(result * (cutsArray[i] - result));


		}
	}
}
