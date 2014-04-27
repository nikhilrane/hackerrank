/*
Problem Statement:
https://www.hackerrank.com/challenges/utopian-tree

The Utopian tree goes through 2 cycles of growth every year. The first growth cycle of the tree is during the monsoon season when it doubles in height. The second growth cycle is during the summer when it increases in height by 1 meter. If a new Utopian tree sapling of height 1 meter is planted just before the onset of the monsoon season, can you find the height of the tree after N cycles?

Input Format
The first line of the input contains an integer T, the number of testcases. 
T lines follow each line containing the integer N, indicating the number of cycles.

Constraints
1 <= T <= 10
0 <= N <= 60
*/

import java.io.*;



class UtopianTree
{
	public static void main(String args[]) throws Exception
	{
		int noOfTC = 0;
		int noOfSeasons = 0;
		int cycleArray[];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
//			System.out.println("Number of TCs: ");
			noOfTC = Integer.parseInt(br.readLine());
		} while(noOfTC < 1 || noOfTC > 10);

		cycleArray = new int[noOfTC];

		for(int i=0; i < noOfTC; i++)
		{
			do {
//				System.out.println("Number of TCs: ");
				cycleArray[i] = Integer.parseInt(br.readLine());
			} while(cycleArray[i] < 0 || cycleArray[i] > 60);
		}

		for(int i=0; i < noOfTC; i++)
		{
			int result = 1;			//the first time the plant is planted
			boolean monsoon = true;
			for(int j=0; j < cycleArray[i]; j++)
			{
				result = monsoon? result * 2 : result + 1;
				monsoon = !monsoon;	//invert flag

				if(!monsoon && j < cycleArray[i]-1)
				{
					result = result + 1;
					monsoon = true;
					j++;
				}
			}
			
			System.out.println(result);
		}

	}
}
