package ask.apps.platform.client.base;

import java.util.Set;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TreeMenuType;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.ISearchForm;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.platform.util.collection.OrderedCollection;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.client.base.BaseTablePage.InnerBaseTable;
import ask.apps.platform.shared.work.BaseTablePageData;
import ask.apps.platform.shared.work.IBaseService;

@Data(BaseTablePageData.class)
public class BaseTablePage extends AbstractPageWithTable<InnerBaseTable> {

	public class InnerBaseTable extends BaseTable {

	}

	@Order(1000)
	public class MyMenuMenu2 extends AbstractMenu {
		@Override
		protected String getConfiguredText() {
			return TEXTS.get("MyMenuMenu2");
		}

		@Override
		protected Set<? extends IMenuType> getConfiguredMenuTypes() {
			return CollectionUtility.hashSet(TreeMenuType.EmptySpace, TreeMenuType.SingleSelection, TreeMenuType.MultiSelection);
		}

		@Override
		protected void execAction() {
		}
	}

	@Override
	protected boolean getConfiguredLeaf() {
		
		return true; //super.getConfiguredLeaf();
	}

	@Override
	protected Class<? extends ISearchForm> getConfiguredSearchForm() {
		// TODO Auto-generated method stub
		return super.getConfiguredSearchForm();
	}

	@Override
	protected boolean getConfiguredSearchRequired() {
		// TODO Auto-generated method stub
		return false; //super.getConfiguredSearchRequired();
	}

	@Override
	protected boolean getConfiguredTableStatusVisible() {
		// TODO Auto-generated method stub
		return true; //super.getConfiguredTableStatusVisible();
	}

	@Override
	protected boolean getConfiguredLazyExpandingEnabled() {
		// TODO Auto-generated method stub
		return super.getConfiguredLazyExpandingEnabled();
	}

	@Override
	protected void addDefaultTableControls() {
		// TODO Auto-generated method stub
		super.addDefaultTableControls();
	}

	@Override
	public ISearchForm getSearchFormInternal() {
		// TODO Auto-generated method stub
		return super.getSearchFormInternal();
	}

	@Override
	public SearchFilter getSearchFilter() {
		// TODO Auto-generated method stub
		return super.getSearchFilter();
	}

	@Override
	protected String getConfiguredTitle() {
		// TODO [oleg] verify translation
		return TEXTS.get("BaseTablePage");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IBaseService.class).getBaseTableData(filter));
	}

	@Override
	protected void injectMenusInternal(OrderedCollection<IMenu> menus) {
		// TODO Auto-generated method stub
		super.injectMenusInternal(menus);
	}
}
