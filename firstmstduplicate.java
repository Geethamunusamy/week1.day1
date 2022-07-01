package week3day2;



	import java.util.HashMap;
	import java.util.Map;

	public class firstmstduplicate {
		
		public static void main (String[] args)
		
		{
			int count=0;
			String input="abbaba";
			Map<Character,Integer> mapob=new HashMap<>();
			
			char[] CharArray=input.toCharArray();
			
			char str=input.charAt(0);
			
			for(int i=0;i<CharArray.length;i++)
				
			{
				mapob.put(CharArray[i],mapob.getOrDefault(CharArray[i],0)+1);
				
				if(mapob.get(CharArray[i])>count)
				{
					str=CharArray[i];
					count=mapob.get(CharArray[i]);
					
				}
					
			}
			
			System.out.println(str);
			
			System.out.println(count);
				
				
				
				
			}

		}
			
			
			
			
			
		

