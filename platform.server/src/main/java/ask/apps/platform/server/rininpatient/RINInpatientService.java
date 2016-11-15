package ask.apps.platform.server.rininpatient;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.shared.rininpatient.IRINInpatientService;
import ask.apps.platform.shared.rininpatient.RINInpatientTablePageData;

public class RINInpatientService implements IRINInpatientService {

	@Override
	public RINInpatientTablePageData getRINInpatientTableData(SearchFilter filter) {
		RINInpatientTablePageData pageData = new RINInpatientTablePageData();
		// TODO [olegs] fill pageData.
		return pageData;
	}
}
