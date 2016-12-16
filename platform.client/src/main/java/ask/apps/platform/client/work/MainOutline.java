package ask.apps.platform.client.work;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;

import ask.apps.platform.client.pages.PAQueueTablePage;
import ask.apps.platform.client.pages.RINInpatientTablePage;
import ask.apps.platform.shared.Icons;

/**
 * <h3>{@link MainOutline}</h3>
 *
 * @author oleg
 */
@Order(1000)
public class MainOutline extends AbstractOutline {

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
		pageList.add(new RINInpatientTablePage()); 
		pageList.add(new PAQueueTablePage());

	}

	@Override
	protected boolean getConfiguredOutlineOverviewVisible() {

		return false;//*/super.getConfiguredOutlineOverviewVisible();
	}

	@Override
	protected boolean getConfiguredNavigateButtonsVisible() {

		return false;
	}

	@Override
	protected boolean getConfiguredRootHandlesVisible() {

		return /*false;//*/super.getConfiguredRootHandlesVisible();
	}
}
