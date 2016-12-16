package ask.apps.platform.client.base;

import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateTimeColumn;

public class BaseDateColumnDayTime extends AbstractDateTimeColumn {

	@Override
	protected int getConfiguredWidth() {
		return 120;
	}

	@Override
	protected String getConfiguredFormat() {
		return "dd.MM.yyyy HH:mm";
	}
}
