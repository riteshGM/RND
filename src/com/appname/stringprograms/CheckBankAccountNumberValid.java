package com.appname.stringprograms;

import java.util.regex.Pattern;

import com.appname.ExceptionHandling.AdvanceExceptionHandling;

/**
 * 
 * 
 A bank account number is a unique number that is assigned to the account holder after opening their account in any specific bank. In technical terms, we can consider the Bank account number as the Primary Key. A bank account number enables us to do debit, credit, and other transactions. As per RBI Guidelines, Bank Account Number has a unique structure. The structure of the Account Number is as follows:

#1 Bank Account Number is written only in numeric form.
#2 Bank Account number length varies from 9 digits to 18 digits.
#3 No Whitespaces are allowed.
#4 Special characters are not allowed.
#5 It contains numbers from 0 to 9.
 *  
 */

public class CheckBankAccountNumberValid {

	public static void main(String[] args) {
		
		String regex = "^[0-9]{9,18}$";
		Pattern ONLY_NUMERIC = Pattern.compile(regex);
		//String bankAcc = "12352458930"; //Valid
		//String bankAcc = "12352458"; //Invalid due to length less than 9
		//String bankAcc = "12352458930 "; // Invalid due to white space
		//String bankAcc = "1235245_8930"; //Invalid due to underscore
		String bankAcc = "SBI123524581"; //Since has alphabets
		
		
		if(ONLY_NUMERIC.matcher(bankAcc).find()) {
			System.out.println("Bank Account Number "+bankAcc+" is Valid");
		}else {
			System.out.println("Bank Account Number "+bankAcc+" is Invalid");
		}
	}

}
