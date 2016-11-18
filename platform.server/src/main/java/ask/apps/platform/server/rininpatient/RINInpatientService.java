package ask.apps.platform.server.rininpatient;

import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.server.sql.SQLs;
import ask.apps.platform.shared.rininpatient.IRINInpatientService;
import ask.apps.platform.shared.rininpatient.RINInpatientTablePageData;

public class RINInpatientService implements IRINInpatientService {

	@Override
	public RINInpatientTablePageData getRINInpatientTableData(SearchFilter filter) {
		RINInpatientTablePageData pageData = new RINInpatientTablePageData();
		
		String sql = SQLs.RININPATIENT_PAGE_SELECT + SQLs.RININPATIENT_PAGE_SELECT_INTO;
		SQL.selectInto(sql, new NVPair("page",pageData));

		return pageData;
	}
}
