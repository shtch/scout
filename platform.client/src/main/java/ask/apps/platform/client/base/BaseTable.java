package ask.apps.platform.client.base;

import java.util.Set;

import org.eclipse.scout.rt.client.ui.action.keystroke.AbstractKeyStroke;
import org.eclipse.scout.rt.client.ui.action.keystroke.IKeyStroke;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TableMenuType;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.platform.util.collection.OrderedCollection;
import org.eclipse.scout.rt.shared.TEXTS;

public class BaseTable extends AbstractTable {
	

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