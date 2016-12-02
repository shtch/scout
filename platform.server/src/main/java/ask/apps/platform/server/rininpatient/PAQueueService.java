package ask.apps.platform.server.rininpatient;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.shared.rininpatient.IPAQueueService;
import ask.apps.platform.shared.rininpatient.PAQueueTablePageData;

public class PAQueueService implements IPAQueueService {

	@Override
	public PAQueueTablePageData getPAQueueTableData(SearchFilter filter) {
		PAQueueTablePageData pageData = new PAQueueTablePageData();
		// TODO [oleg] fill pageData.
		return pageData;
	}
}
