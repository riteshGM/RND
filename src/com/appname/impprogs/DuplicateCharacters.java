package com.appname.impprogs;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		String str = new String("maximum minium mmmmmmm");
		char[] c=str.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			count=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j] && c[i]!=' ')  {
					
					count++;
					c[j]='0';
					
				}
			}
			if(count>1 && c[i]!='0') {
				System.out.println(c[i]);
			}
		}

	}

}
