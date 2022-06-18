package week2day1;

public class ReverseString
{
	public static void main(String[] args)
	{
		String reve = "feeling good";

		char[] ch = reve.toCharArray();

		for (int i = reve.length() - 1; i >= 0; i--)
		{
			System.out.println(ch[i]);

		}
	}
}
