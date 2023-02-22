package com.appname.impprogs;

/*
You're creating a game with some amusing mini-games, and you've decided to make a simple variant of the game Mahjong.

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
 * Asked in Karat Interview 18-02-2023
 * @author rites
 *
 */
public class StringPuzzle1_BNY {
  
  public boolean checkStringCompleteHand(String input){
    
    String []inputArray = input.split("");
    
    for (String eachLitteral: inputArray) {
      int occurenceCount=0;
      int trippletCount=0;
      int pairCount = 0;
      int remainderCount=0;
      boolean pairFound = false;
      System.out.println(eachLitteral);
      //Find Occurence of Each Litteral in String
      for(String loopEach:inputArray){
        if(eachLitteral.equals(loopEach)){
          System.out.println("Found "+eachLitteral);
          occurenceCount++;
        }
        System.out.println("Found "+eachLitteral+ " "+occurenceCount+" times");
      }
      //This Position we have Occurence Count
      
      if(occurenceCount>=3){
        //check if Triple
        for(int i=occurenceCount;i<3;){
          i=i-3;
          if(i>0){
            trippletCount++;
            remainderCount=i;
          }
        }  
      }
      
      System.out.println("Total Triple Found for "+eachLitteral+ " "+trippletCount);
      if(remainderCount>=2||occurenceCount>=2){
        int needtoCheckCount = 0;
        if(trippletCount>0){
          needtoCheckCount=remainderCount;
        }else{
          needtoCheckCount= occurenceCount;
        }
        //Check for Pair
        for(int j=needtoCheckCount;j>0;){
          j=j-2;
          if(j>0 && !pairFound){
            pairCount++;
            pairFound=true;
          }else{
            return false;
          }
          
          
        } 
      }
    }
    
    return true;
    
  }
  public static void main(String[] argv) {
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
  }
}
