package ask.apps.platform.client.base;

import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithNodes;
import org.eclipse.scout.rt.shared.TEXTS;

public abstract class AbstractBaseNodePage extends AbstractPageWithNodes {

	@Override
	protected String getConfiguredTitle() {
		// TODO [olegs] verify translation
		return TEXTS.get("AbstractBaseNodePage");
	}
}
