package ask.apps.platform.shared.rininpatient;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IRINInpatientService extends IService {

	RINInpatientTablePageData getRINInpatientTableData(SearchFilter filter);
}
