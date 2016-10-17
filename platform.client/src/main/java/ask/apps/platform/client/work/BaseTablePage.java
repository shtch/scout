package ask.apps.platform.client.work;

import java.util.Set;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.action.keystroke.AbstractKeyStroke;
import org.eclipse.scout.rt.client.ui.action.keystroke.IKeyStroke;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TableMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TreeMenuType;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.ISearchForm;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.platform.util.collection.OrderedCollection;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.client.work.BaseTablePage.Table;
import ask.apps.platform.shared.work.BaseTablePageData;
import ask.apps.platform.shared.work.IBaseService;

@Data(BaseTablePageData.class)
public class BaseTablePage extends AbstractPageWithTable<Table> {

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
		
		return false; //super.getConfiguredLeaf();
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

	public class Table extends AbstractTable {
		

		@Override
		protected void addHeaderMenus(OrderedCollection<IMenu> menus) {
			// TODO Auto-generated method stub
			//super.addHeaderMenus(menus);
		}

		@Order(-1000)
		public class MyColumn1 extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("MyNlsKey1");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(0)
		public class MyColumn2 extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("MyNlsKey2");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(1000)
		public class MyColumn3 extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("MyNlsKey3");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(1000)
		public class MyKeyStroke extends AbstractKeyStroke {
			@Override
			protected String getConfiguredKeyStroke() {
				return IKeyStroke.F6;
			}

			@Override
			protected void execAction() {
			}
		}

		public MyColumn1 getMyColumn1() {
			return getColumnSet().getColumnByClass(MyColumn1.class);
		}

		public MyColumn2 getMyColumn2() {
			return getColumnSet().getColumnByClass(MyColumn2.class);
		}

		public MyColumn3 getMyColumn3() {
			return getColumnSet().getColumnByClass(MyColumn3.class);
		}

		@Order(1000)
		public class MyMenuMenu extends AbstractMenu {
			@Override
			protected String getConfiguredText() {
				return TEXTS.get("MyMenuMenu");
			}

			@Override
			protected Set<? extends IMenuType> getConfiguredMenuTypes() {
				return CollectionUtility.hashSet(TableMenuType.EmptySpace, TableMenuType.SingleSelection, TableMenuType.MultiSelection);
			}

			@Override
			protected void execAction() {
			}
		}
		
	}
}
