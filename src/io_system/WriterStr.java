package io_system;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WriterStr {

    public static void main(String[] args) {

	Writer out = new PrintWriter(System.out);
	
	try {
	    /**Using characters method to output data*/
	    char[] cs = "this is another test of output way.\n".toCharArray();
	    out.write(cs);
	    cs = "this is second line.\n".toCharArray();
	    out.write(cs);
	    
	    out.flush();
	    out.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

}
