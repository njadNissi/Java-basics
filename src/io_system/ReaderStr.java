package io_system;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderStr {

    public static void main(String[] args) {

	InputStreamReader rin = new InputStreamReader(System.in);
	
	try {
	    /**Using characters method to input data*/
	    char[] cs = new char[50];
	    rin.read(cs);
	    String str = new String(cs);
	    System.out.println("read message : " + str.trim());
	} catch (IOException e) {
	  e.printStackTrace();
	}

    }

}
