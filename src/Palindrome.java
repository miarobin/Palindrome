

public class Palindrome
{
	private String originalText;
	
	public Palindrome()
	{
		originalText = "";
	}
	
	public static void main(String[] args)
	{
		Palindrome palindrome = new Palindrome();
		palindrome.isPalindrome("Race car");
		palindrome.isPalindrome("hello world");
		palindrome.isPalindrome("Sex at noon taxes");
	}
	
	public boolean isPalindrome(String text)
	{
		originalText = text;
		text = text.trim();
		text = text.toLowerCase();
		text = text.replaceAll(" ", "");
		
		for(int i = 0; i < (text.length() - 1)/2; i++)
		{
			if(text.charAt(i) != text.charAt(text.length() - i - 1))
			{
				System.out.println(originalText + " is not a palindrome.");
				return false;
			}
		}
		
		
		System.out.println(originalText + " is a palindrome.");
		return true;
	}
}