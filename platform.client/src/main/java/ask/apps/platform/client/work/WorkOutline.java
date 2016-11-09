package ask.apps.platform.client.work;

import java.util.List;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

import ask.apps.platform.shared.Icons;

/**
 * <h3>{@link WorkOutline}</h3>
 *
 * @author oleg
 */
@Order(1000)
public class WorkOutline extends AbstractOutline {

	@Override
	protected String getConfiguredIconId() {
		return Icons.Pencil;
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Work");
	}

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		pageList.add(new BaseTablePage());

	}
}
