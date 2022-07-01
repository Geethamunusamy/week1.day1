package week3day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates
{

	public static void main(String[] args)
	{
		Set<Integer> number1 = new LinkedHashSet<>();
		number1.add(1);
		number1.add(3);
		number1.add(5);
		number1.add(7);
		number1.add(9);
		number1.add(11);
		number1.add(7);
		number1.add(5);
		number1.add(3);
		number1.add(1);
		number1.add(11);
		number1.add(9);

		int setSize = number1.size();

		List<Integer> arr = arr = new ArrayList(setSize);

		for (int num : number1)
		{
			arr.addAll(number1);
			System.out.println("The numbers are:" + num);
		}

	}
}
