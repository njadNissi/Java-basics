package io_system;

import java.io.IOException;
import java.io.OutputStream;

public class OutbutStreamWriteStr {

    public static void main(String[] args) {

	OutputStream out = System.out;
	
	try {
	    /**Using byte method to output data*/
	    byte[] bs = "the outPutStream shows this text.\n".getBytes();
	    out.write(bs);
	    bs = "output data: \n".getBytes();
	    out.write(bs);
	    bs = "Hi, Everyone!\n".getBytes();
	    out.write(bs);
	} catch (IOException e) {
	   
	}
    }
    
}
