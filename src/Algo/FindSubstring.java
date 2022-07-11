package Algo;

public class FindSubstring {
	
	private static boolean contains(String s, String w) {
		boolean same = false;
		int lastTestIndex = 0;
		
		for (int i = 0; i < s.length() - w.length() + 1; i++) {/**make sure the # of chars from the i to the last is >= length of searched word*/
			
			if(!same) {
				
				lastTestIndex = i;
				
				if (s.charAt(i) == w.charAt(0)) {/**found an initial occurrence*/
					
					for (int j = i, k = 0; j < i + w.length(); j++, k++) {/**start from the initial to char at j+lengthOfWord-1*/
						
						if(s.charAt(j) != w.charAt(k))
							break;
						
						same = true;
						if(j == i + w.length() - 1) {
							System.out.println("(#1)substring from ["+ i + "] to [" + j + "]");
							
						}
					}
				}
			}
		}
		System.out.println("(#2)last test index = " + lastTestIndex);
		return same;
	}
	
	public static void main(String[] args) {
		
		System.out.println(contains("Papa est ici tr", "ici"));

	}

}
