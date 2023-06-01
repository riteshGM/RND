package com.appname.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambaExpressionsSample2 {
	
	public static void main (String args[]) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		Consumer <Integer> consumer = (Integer t) ->
				System.out.print(t +" ");
		list.forEach(consumer);
	}

}
