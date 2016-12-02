package ask.apps.platform.server.rininpatient;

import org.eclipse.scout.rt.platform.holders.NVPair;
import org.eclipse.scout.rt.server.jdbc.SQL;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.server.sql.SQLs;
import ask.apps.platform.shared.rininpatient.IPAQueueService;
import ask.apps.platform.shared.rininpatient.PAQueueTablePageData;

public class PAQueueService implements IPAQueueService {

	@Override
	public PAQueueTablePageData getPAQueueTableData(SearchFilter filter) {
		PAQueueTablePageData pageData = new PAQueueTablePageData();
		
		String sql = SQLs.PAQUEUE_PAGE_SELECT + SQLs.PAQUEUE_PAGE_SELECT_INTO;
		SQL.selectInto(sql, new NVPair("page",pageData));
		
		return pageData;
	}
}
