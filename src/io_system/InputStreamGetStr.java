package io_system;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamGetStr {

    public static void main(String[] args) {
	
	InputStream in = System.in;
	
	try {
	    /**Using byte method to input data*/
	    byte[] bs = new byte[50]; 
	    /*int i = */in.read(bs);
	    System.out.println("from keyboard: " + new String(bs).trim());
	} catch(IOException e) {
	    
	}
	
    }
    
}
