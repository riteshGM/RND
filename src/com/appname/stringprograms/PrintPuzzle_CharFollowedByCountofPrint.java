package com.appname.stringprograms;

public class PrintPuzzle_CharFollowedByCountofPrint {

	public static void main(String[] args) {
		String input = "a12b1c15";
		
		StringBuilder digit = new StringBuilder();
		char actual = '\0' ;
		char next = '\0';
		int index = 0;
		while (index <= input.length()) {
			char each = input.charAt(index);
			if(Character.isAlphabetic(each) && actual == '\0') {
				actual = each;
			}else if (Character.isDigit(each)) {
				digit.append(each);
			}else if (Character.isAlphabetic(each) && actual != '\0') {
				next = each;
			}else {
				System.out.println("Danger : Condition not handled value is "+each);
				break;
			}
			
			if(next!= '\0' && actual != '\0') {
				System.out.println("Actual "+actual);
				System.out.println("Next "+next);
				System.out.println("Print Count "+digit);
			int loop = Integer.parseInt(digit.toString());
				for(int i = 0 ; i<loop ; i++) {
					System.out.print(actual);
				}
			actual = next;
			next = '\0';
				digit.setLength(0);
			}
			index++;
		}
	}

}
