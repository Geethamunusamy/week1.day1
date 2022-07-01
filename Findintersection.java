package week3day2;

import java.util.ArrayList;
import java.util.List;

public class Findintersection
{

	public static void main(String[] args)
	{

		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);

		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);

		for (Integer eachvalue1 : list1)
		{
			for (Integer eachvalue2 : list2)
			{
				if (eachvalue1 == eachvalue2)
				{
					System.out.println(eachvalue1);
				}
			}
		}

	}

}