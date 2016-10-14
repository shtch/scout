/**
 * 
 */
package ask.apps.platform.ui.html;

import java.io.IOException;
import java.util.Arrays;

import org.eclipse.scout.rt.platform.security.ICredentialVerifier;

/**
 * @author oleg
 *
 */
public class DBCredentialVerifier implements ICredentialVerifier {

	@Override
	public int verify(String username, char[] password) throws IOException {
		// TODO Auto-generated method stub
		//return 
	    if (!Arrays.equals("1".toCharArray(), password)) {
	        return AUTH_FORBIDDEN;
	    }
		return AUTH_OK;
	}

}
