import org.apache.tools.ant.Task;
import org.apache.tools.ant.BuildException;
import java.util.Vector;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.io.IOException;
import java.io.File;

public class JabacoAntTask extends Task {

    /** The message to print. As attribute. */
    String message;
    public void setMessage(String msg) {
        message = msg;
    }

    /** the output folder for the VB class files, as attribute */
    Path vbPath;
    public void setVbPath(Path vbPath) {
    	//System.out.print(vbPath.toString());
    	this.vbPath = vbPath;
    }

    /** Should the build fail? Defaults to false. As attribute. */
    boolean fail = false;
    public void setFail(boolean b) {
        fail = b;
    }

    /** Support for nested text. */
    public void addText(String text) {
        message = text;
    }

    /** Do the work. */
    public void execute() {
        // handle attribute 'fail'
        if (fail) {
        	throw new BuildException("Fail requested.");
        }

        // handle attribute 'message' and nested text
        if (message != null)  {
        	log(message);
        }
        if (vbPath != null) {
        	// In interface class files, replace 0x0201 with 0x0601.
        	//log(String.format("Path to VB class files is %s.", vbPath.toString()));
        	try {
	        	File dir = new File(vbPath.toString());
	        	File[] files = dir.listFiles((d, name) -> name.startsWith("I"));
	        	for (File file : files) {
	        		System.out.println(file.toString());
	        		byte[] classAsBinary = Files.readAllBytes(file.toPath());
	        		final byte[] SEARCH = new byte[] {0x02, 0x01};
	        		final byte REPLACE = 0x06;
        		    boolean find = false;
        		    int i;
        		    for (i = 0; i <= (classAsBinary.length - SEARCH.length); i++) {
        		        if (classAsBinary[i] == SEARCH[0]) {
        		            find = true;
        		            for (int j = 0; j < SEARCH.length; j++) {
        		                if (classAsBinary[i + j] != SEARCH[j]) {
        		                    find = false;
        		                }
        		            }
        		        }
        		        if (find) {
        		            break;
        		        }
        		    }
        		    if (find) {
        		    	System.out.println(String.format("%s: Found access tag at position %d.", file.toString(), i));
        		    }
        		    else {
    	        		System.out.println(String.format("%s: Could not find access tag.", file.toString()));
        		    }
	        		// Replace 0x0201 with 0x0601.
        		    classAsBinary[i] = REPLACE;
        		    Files.write(file.toPath(), classAsBinary);
        		}
	        }
        	catch(Exception ex) {
        		System.err.print(ex.getMessage());
        	}
        }


        // Could not get the nested elements to compile with Ant version 
        // handle nested elements
//        for (Iterator it=messages.iterator(); it.hasNext(); ) {
//            Message msg = (Message)it.next();
//            log(msg.getMsg());
//        }
    }


    /** Store nested 'message's. */
    //Vector messages = new Vector();

    /** Factory method for creating nested 'message's. */
//    public Message createMessage() {
//        Message msg = new Message();
//        messages.add(msg);
//        return msg;
//    }
}
