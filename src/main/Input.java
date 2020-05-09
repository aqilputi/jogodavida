package main;

public class Input {
	static public int handle(String inputstr) {
		if(inputstr.length() == 1) {
			if(inputstr.charAt(0) == 'c')
				return 1;
			if(inputstr.charAt(0) == 'q')
				return -1;
		}
		
		if(inputstr.length() == 3)
			
			if(Character.isDigit(inputstr.charAt(0)))
				if(Character.getNumericValue(inputstr.charAt(0)) <= 5 && 
						Character.getNumericValue(inputstr.charAt(0)) >= 0)
					if(inputstr.charAt(1) == ' ')
						if(Character.isDigit(inputstr.charAt(2)))
							if(Character.getNumericValue(inputstr.charAt(2)) <= 5 && 
									Character.getNumericValue(inputstr.charAt(2)) >= 0)
								return 2;
	
        throw new IllegalArgumentException(inputstr);
	}
		
}
