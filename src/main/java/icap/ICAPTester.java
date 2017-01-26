/**
 * 
 */
package icap;

import java.io.IOException;

/**
 * @author skallem
 *
 */
public class ICAPTester {
	public static void main(String[] args) {
		try {
			Integer port = 3000; //Replace this with server port
			String hostIp = "127.0.0"; //Replace this with server IP address.
			ICAP icap = new ICAP(hostIp, port, "avscan");

			String[] files = new String[] {
					//"/Users/skallem/Downloads/test_malware.txt",
					"/path/to/file/file.pdf"
					};
			
			for (String file : files) {
				try {
					System.out.print(file + ": ");
					boolean result = icap.scanFile(file);
					System.out.println(result == true ? "Clean" : "Infected");
				} catch (ICAPException ex) {
					System.err.println("Could not scan file " + file + ": "
							+ ex.getMessage());
				} catch (IOException ex) {
					System.err.println("IO error occurred when scanning file "
							+ file + ": " + ex.getMessage());
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ICAPException e) {
			System.out.println(e.getMessage());
		}

	}
}
