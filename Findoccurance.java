package week3day2;

import java.util.Map;
import java.util.TreeMap;

public class Findoccurance
{
	public static void main(String[] args)
	{
		int[] input = new int[] {2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1};

		Map<Integer, Integer> countmap = new TreeMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++)
		{
			int c = input[i];

			if (countmap.containsKey(c))
			{
				countmap.put(c, countmap.get(c) + 1);

			}

			else

			{

				countmap.put(c, 1);
			}

			System.out.println(countmap);

		}
	}

}
