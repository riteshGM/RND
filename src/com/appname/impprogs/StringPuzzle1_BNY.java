package com.appname.impprogs;

/*
In this variant, players have a number of tiles, each marked 0-9. The tiles can be grouped into pairs or triples of the same tile. For example, if a player has "33344466", the player's hand has a triple of 3s, a triple of 4s, and a pair of 6s. Similarly, "55555777" has a triple of 5s, a pair of 5s, and a triple of 7s.

A "complete hand" is defined as a collection of tiles where all the tiles can be grouped into any number of triples (zero or more) and exactly one pair, and each tile is used in exactly one triple or pair.

Write a function that takes a string representation of a collection of tiles in no particular order, and returns true or false depending on whether or not the collection represents a complete hand.

tiles0 =  "84848" True 
tiles_1 = "88844"           # True. Base case - a pair and a triple
tiles_2 = "99"              # True. Just a pair is enough.
tiles_3 = "55555"           # True. The triple and a pair can be of the same tile value
tiles_4 = "22333333"        # True. A pair and two triples
tiles_5 = "73797439949499477339977777997394947947477993"
                            # True. 4 has two triples and a pair, other numbers have just triples
tiles_6 = "111333555"       # False. There are three triples, 111 333 555 but no pair
tiles_7 = "42"              # False. Two singles not forming a pair
tiles_8 = "888"             # False. A triple, no pair
tiles_9 = "100100000"       # False. A pair of 1 and two triples of 0, a left over 0
tiles_10 = "346664366"      # False. Three pairs and a triple
tiles_11 = "8999998999898"  # False. A triple of 8, three triples of 9, a leftover 8
tiles_12 = "17610177"       # False. Triples of 1, and 7, left over 6 and 0
tiles_13 = "600061166"      # False. A pair of 1, triple of 0, triple of 6, and 6 leftover
tiles_14 = "6996999"        # False. A pair of 6, a triple of 9 and another pair of 9
tiles_15 = "03799449"       # False. A pair of 4, triple of 9 and 0, 3, and 7 left over
tiles_16 = "64444333355556" # False. A pair of 6, two pairs each of 3, 4, 5
tiles_17 = "7"              # False. No pairs and 7 leftover

complete(tiles_1) => True
complete(tiles_2) => True
complete(tiles_3) => True
complete(tiles_4) => True
complete(tiles_5) => True
complete(tiles_6) => False
complete(tiles_7) => False
complete(tiles_8) => False
complete(tiles_9) => False
complete(tiles_10) => False
complete(tiles_11) => False
complete(tiles_12) => False
complete(tiles_13) => False
complete(tiles_14) => False
complete(tiles_15) => False
complete(tiles_16) => False
complete(tiles_17) => False

Complexity Variable
N - Number of tiles in the input string
 */

import java.io.*;
import java.util.*;

/**
 * Asked in Karat Interview 18-02-2023 Rules - Presence in Triple or pair is
 * accepted - not necessarily consecutive 
 * 1 pair is compulsory
 * No Triple present is okay
 * If remainder Occurrence is single -
 * return False
 * 
 * @author rites
 *
 */
public class StringPuzzle1_BNY {

	public static boolean checkStringCompleteHand(String input) {
		String[] inputArray = input.split("");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// Get Count in HashMap
		for (String eachString : inputArray) {
			// System.out.println(eachString);
			if (map.get(eachString) == null) {
				// First Time Entry
				map.put(eachString, 1);
			} else {
				map.put(eachString, map.get(eachString) + 1);
			}
		}
		System.out.println(map);
		// Identify if %3 ==0 and %2==0
		boolean pairFound = false;
		for (String eachKey : map.keySet()) {
			int count = map.get(eachKey);
			if (count % 3 != 0) {
				int tripleCount = count/3;
				count = count % 3;
				System.out.println("Count Remainder After Checking Triplet for " + eachKey + " is " + count);
				if (count % 2 != 0) {
					count = count % 2;
					System.out.println("Count Remainder After Checking Pair for " + eachKey + " is " + count);
					return false;
				}else {
						pairFound = true;
				}
			}
		}
		if(pairFound) {
			return true;	
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		String tiles_1 = "88844";
		String tiles_2 = "99";
		String tiles_3 = "55555";
		String tiles_4 = "22333333";
		String tiles_5 = "73797439949499477339977777997394947947477993";
		String tiles_6 = "111333555";
		String tiles_7 = "42";
		String tiles_8 = "888";
		String tiles_9 = "100100000";
		String tiles_10 = "346664366";
		String tiles_11 = "8999998999898";
		String tiles_12 = "17610177";
		String tiles_13 = "600061166";
		String tiles_14 = "6996999";
		String tiles_15 = "03799449";
		String tiles_16 = "64444333355556";
		String tiles_17 = "7";

		System.out.println("Tiles_1 is Complete Hand " + checkStringCompleteHand(tiles_1));
		System.out.println("Tiles_2 is Complete Hand " + checkStringCompleteHand(tiles_2));
		System.out.println("Tiles_3 is Complete Hand " + checkStringCompleteHand(tiles_3));
		System.out.println("Tiles_4 is Complete Hand " + checkStringCompleteHand(tiles_4));
		System.out.println("Tiles_5 is Complete Hand " + checkStringCompleteHand(tiles_5));
		System.out.println("Tiles_6 is Complete Hand " + checkStringCompleteHand(tiles_6));
		System.out.println("Tiles_7 is Complete Hand " + checkStringCompleteHand(tiles_7));
		System.out.println("Tiles_8 is Complete Hand " + checkStringCompleteHand(tiles_8));
		System.out.println("Tiles_9 is Complete Hand " + checkStringCompleteHand(tiles_9));
		System.out.println("Tiles_10 is Complete Hand " + checkStringCompleteHand(tiles_10));
		System.out.println("Tiles_11 is Complete Hand " + checkStringCompleteHand(tiles_11));
		System.out.println("Tiles_12 is Complete Hand " + checkStringCompleteHand(tiles_12));
		System.out.println("Tiles_13 is Complete Hand " + checkStringCompleteHand(tiles_13));
		System.out.println("Tiles_14 is Complete Hand " + checkStringCompleteHand(tiles_14));
		System.out.println("Tiles_15 is Complete Hand " + checkStringCompleteHand(tiles_15));
		System.out.println("Tiles_16 is Complete Hand " + checkStringCompleteHand(tiles_16));
		System.out.println("Tiles_17 is Complete Hand " + checkStringCompleteHand(tiles_17));
		System.out.println(checkStringCompleteHand("88881118"));
		
	}
}
