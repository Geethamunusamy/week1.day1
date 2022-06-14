package week1day2;

public class PrintDuplicatesInArray
{
	public static void main(String[] args)
	{	// Index     0   1   2   3   4   5   6   7   8   9   10  11  12
		int[] arr = {14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20};
		
		// get the length of the array
		int length = arr.length;
		
		// declare an int variable named count
		int count;
		
		// iterate from 0 to the array length-2 (outer loop starts here)
		for (int i = 0; i <= length - 2; i = i + 1)
		{
			// assign 0 to count
			count = 0;
			
			// iterate from i+1 to the length-1 of the array by adding 1 to it (inner loop starts here)
			for (int j = i + 1; j <= length - 1; j = j + 1)
			{
				// compare both the loop variables & check they're equal
				if (arr[i] == arr[j])
				{
					// increase the count if both the arrays are equal
					count = count + 1;
				}
			}
			
			// Out of the inner loop, check and print the first array variable if count is more than 0
			if (count > 0)
			{
				System.out.println(arr[i]);
			}
		}
		
			
	}
	
}