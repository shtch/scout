package ask.apps.platform.client.work;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.client.ui.form.IForm;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;

import ask.apps.platform.client.base.BaseTablePage;
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
/*
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		pageList.add(new BaseTablePage());
		pageList.add(new RINInpatientTablePage()); 
		pageList.add(new BaseNodePage());

	}
*/
	@Override
	protected IPage<?> execCreateRootPage() {

		return new BaseTablePage();//*/super.execCreateRootPage();
	}

	@Override
	public IPage<?> getActivePage() {
		// TODO Auto-generated method stub
		return super.getActivePage();
	}

	@Override
	public void makeActivePageToContextPage() {
		// TODO Auto-generated method stub
		super.makeActivePageToContextPage();
	}

	@Override
	protected boolean getConfiguredEnabled() {
		// TODO Auto-generated method stub
		return super.getConfiguredEnabled();
	}

	@Override
	protected boolean getConfiguredVisible() {
		// TODO Auto-generated method stub
		return super.getConfiguredVisible();
	}

	@Override
	protected double getConfiguredViewOrder() {
		// TODO Auto-generated method stub
		return super.getConfiguredViewOrder();
	}

	@Override
	protected Class<? extends IForm> getConfiguredDefaultDetailForm() {
		// TODO Auto-generated method stub
		return super.getConfiguredDefaultDetailForm();
	}

	@Override
	protected boolean getConfiguredOutlineOverviewVisible() {

		return false;//*/super.getConfiguredOutlineOverviewVisible();
	}

	@Override
	protected boolean getConfiguredAutoToggleBreadcrumbStyle() {
		// TODO Auto-generated method stub
		return super.getConfiguredAutoToggleBreadcrumbStyle();
	}

	@Override
	protected boolean getConfiguredNavigateButtonsVisible() {

		return false;
	}

	@Override
	protected String getConfiguredDefaultIconId() {
		// TODO Auto-generated method stub
		return super.getConfiguredDefaultIconId();
	}

	@Override
	protected String getConfiguredCssClass() {
		// TODO Auto-generated method stub
		return super.getConfiguredCssClass();
	}

	@Override
	protected boolean getConfiguredAutoTitle() {
		// TODO Auto-generated method stub
		return super.getConfiguredAutoTitle();
	}

	@Override
	protected boolean getConfiguredMultiSelect() {
		// TODO Auto-generated method stub
		return super.getConfiguredMultiSelect();
	}

	@Override
	protected boolean getConfiguredMultiCheck() {
		// TODO Auto-generated method stub
		return super.getConfiguredMultiCheck();
	}

	@Override
	protected boolean getConfiguredCheckable() {
		// TODO Auto-generated method stub
		return super.getConfiguredCheckable();
	}

	@Override
	protected int getConfiguredNodeHeightHint() {
		// TODO Auto-generated method stub
		return super.getConfiguredNodeHeightHint();
	}

	@Override
	protected boolean getConfiguredDragEnabled() {
		// TODO Auto-generated method stub
		return super.getConfiguredDragEnabled();
	}

	@Override
	protected int getConfiguredDragType() {
		// TODO Auto-generated method stub
		return super.getConfiguredDragType();
	}

	@Override
	protected int getConfiguredDropType() {
		// TODO Auto-generated method stub
		return super.getConfiguredDropType();
	}

	@Override
	protected long getConfiguredDropMaximumSize() {
		// TODO Auto-generated method stub
		return super.getConfiguredDropMaximumSize();
	}

	@Override
	protected boolean getConfiguredAutoDiscardOnDelete() {
		// TODO Auto-generated method stub
		return super.getConfiguredAutoDiscardOnDelete();
	}

	@Override
	protected boolean getConfiguredRootNodeVisible() {

		return true;//*/super.getConfiguredRootNodeVisible();
	}

	@Override
	protected boolean getConfiguredRootHandlesVisible() {

		return false;//*/super.getConfiguredRootHandlesVisible();
	}

	@Override
	protected boolean getConfiguredScrollToSelection() {
		// TODO Auto-generated method stub
		return super.getConfiguredScrollToSelection();
	}

	@Override
	protected boolean getConfiguredSaveAndRestoreScrollbars() {
		// TODO Auto-generated method stub
		return super.getConfiguredSaveAndRestoreScrollbars();
	}

	@Override
	protected boolean getConfiguredAutoCheckChildNodes() {
		// TODO Auto-generated method stub
		return super.getConfiguredAutoCheckChildNodes();
	}

	@Override
	protected boolean getConfiguredLazyExpandingEnabled() {
		// TODO Auto-generated method stub
		return super.getConfiguredLazyExpandingEnabled();
	}

	@Override
	protected String getConfiguredDisplayStyle() {
		// TODO Auto-generated method stub
		return DISPLAY_STYLE_BREADCRUMB;// super.getConfiguredDisplayStyle();
	}
}
