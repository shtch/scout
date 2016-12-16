package ask.apps.platform.client.base;

import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractDateColumn;

public class BaseDateColumnYear extends AbstractDateColumn {
	
	@Override
	protected int getConfiguredWidth() {
		return 60;
	}

	@Override
	protected String getConfiguredFormat() {
		return "yyyy";
	}
}
