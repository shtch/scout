package ask.apps.platform.server.work;

import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.shared.work.BaseTablePageData;
import ask.apps.platform.shared.work.IBaseService;

public class BaseService implements IBaseService {

	@Override
	public BaseTablePageData getBaseTableData(SearchFilter filter) {
		BaseTablePageData pageData = new BaseTablePageData();
		// TODO [oleg] fill pageData.
		return pageData;
	}
}
