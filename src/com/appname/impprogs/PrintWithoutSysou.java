package com.appname.impprogs;

import java.io.IOException;
import java.io.OutputStreamWriter;
public class PrintWithoutSysou {
   public static void main(String args[]) throws IOException {
      //Creating a OutputStreamWriter object
      OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
      streamWriter.write("Hello welcome to Tutorialspoint . . . . .");
      
      for(int i =0 ; i<10; i++) {
    	  streamWriter.write(String.valueOf(i));  
      }
      
      streamWriter.flush();
   }
}
