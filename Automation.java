package week3day2;

public class Automation extends MultipleLanguage
{

	@Override
	public String ruby(String str)
	{
		return str;
	}

	public void Java()
	{
		System.out.println("Java is a programming language");
	}

	@Override
	public void Selenium()
	{
		System.out.println("Selenium is a language");

	}

	public static void main(String[] args)
	{
		Automation ac = new Automation();
		System.out.println(ac.ruby("Ruby unimplemented Language"));
		System.out.println("Ruby is a language");
		ac.Java();
		System.out.println("Java is a programming language");
		ac.Python();
		System.out.println("Python is also a language");
		ac.Selenium();

	}

}
