package ask.apps.platform.server.security;

import java.security.AllPermission;
import java.security.Permissions;

import ask.apps.platform.shared.security.AccessControlService;
import org.eclipse.scout.rt.platform.Replace;
import org.eclipse.scout.rt.shared.security.RemoteServiceAccessPermission;

/**
 * <h3>{@link AccessControlService}</h3>
 *
 * @author oleg
 */
@Replace
public class ServerAccessControlService extends AccessControlService {

  @Override
  protected Permissions execLoadPermissions(String userId) {
    Permissions permissions = new Permissions();
    permissions.add(new RemoteServiceAccessPermission("*.shared.*", "*"));

    //TODO [oleg]: Fill access control service
    permissions.add(new AllPermission());
    return permissions;
  }
}
