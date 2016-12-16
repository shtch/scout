package ask.apps.platform.client.base;

import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateColumn;

public class BaseDateColumnDay extends AbstractDateColumn {

	@Override
	protected int getConfiguredWidth() {
		return 100;
	}

	@Override
	protected String getConfiguredFormat() {
		return "dd.MM.yyyy";
	}
}
