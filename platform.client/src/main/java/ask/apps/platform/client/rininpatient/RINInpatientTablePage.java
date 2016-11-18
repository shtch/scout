package ask.apps.platform.client.rininpatient;

import java.util.List;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.action.menu.IMenu;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractBooleanColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.basic.table.controls.ITableControl;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.client.rininpatient.RINInpatientTablePage.RINInpatientTable;
import ask.apps.platform.shared.rininpatient.IRINInpatientService;
import ask.apps.platform.shared.rininpatient.RINInpatientTablePageData;

@Data(RINInpatientTablePageData.class)
public class RINInpatientTablePage extends AbstractPageWithTable<RINInpatientTable> {

	@Override
	protected String getConfiguredTitle() {

		return TEXTS.get("RINInpatient");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IRINInpatientService.class).getRINInpatientTableData(filter));
	}

	@Override
	protected boolean getConfiguredLeaf() {

		return true;
	}

	public class RINInpatientTable extends AbstractTable {
		

		public Show_idColumn getShow_idColumn() {
			return getColumnSet().getColumnByClass(Show_idColumn.class);
		}


		@Order(100)
		public class Show_idColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Show_IDColumnName");
			}
		
			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		public Full_nameColumn getFull_nameColumn() {
			return getColumnSet().getColumnByClass(Full_nameColumn.class);
		}


		@Order(200)
		public class Full_nameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Full_NameColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 200;
			}
		}


		@Override
		protected String getConfiguredTitle() {
			// TODO Auto-generated method stub
			return super.getConfiguredTitle();
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
		protected boolean getConfiguredRowIconVisible() {
			// TODO Auto-generated method stub
			return super.getConfiguredRowIconVisible();
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
		protected Class<? extends IMenu> getConfiguredDefaultMenu() {
			// TODO Auto-generated method stub
			return super.getConfiguredDefaultMenu();
		}

		@Override
		protected boolean getConfiguredAutoDiscardOnDelete() {
			// TODO Auto-generated method stub
			return super.getConfiguredAutoDiscardOnDelete();
		}

		@Override
		protected boolean getConfiguredSortEnabled() {
			// TODO Auto-generated method stub
			return super.getConfiguredSortEnabled();
		}

		@Override
		protected boolean getConfiguredHeaderVisible() {
			// TODO Auto-generated method stub
			return super.getConfiguredHeaderVisible();
		}

		@Override
		protected boolean getConfiguredHeaderEnabled() {
			// TODO Auto-generated method stub
			return false;//super.getConfiguredHeaderEnabled();
		}

		@Override
		protected boolean getConfiguredAutoResizeColumns() {
			// TODO Auto-generated method stub
			return true;//super.getConfiguredAutoResizeColumns();
		}

		@Override
		protected boolean getConfiguredMultilineText() {
			// TODO Auto-generated method stub
			return super.getConfiguredMultilineText();
		}

		@Override
		protected boolean getConfiguredCheckable() {
			// TODO Auto-generated method stub
			return super.getConfiguredCheckable();
		}

		@Override
		protected Class<? extends AbstractBooleanColumn> getConfiguredCheckableColumn() {
			// TODO Auto-generated method stub
			return super.getConfiguredCheckableColumn();
		}

		@Override
		protected long getConfiguredDropMaximumSize() {
			// TODO Auto-generated method stub
			return super.getConfiguredDropMaximumSize();
		}

		@Override
		protected int getConfiguredDropType() {
			// TODO Auto-generated method stub
			return super.getConfiguredDropType();
		}

		@Override
		protected int getConfiguredDragType() {
			// TODO Auto-generated method stub
			return super.getConfiguredDragType();
		}

		@Override
		protected boolean getConfiguredKeyboardNavigation() {
			// TODO Auto-generated method stub
			return super.getConfiguredKeyboardNavigation();
		}

		@Override
		protected boolean getConfiguredScrollToSelection() {
			// TODO Auto-generated method stub
			return super.getConfiguredScrollToSelection();
		}

		@Override
		protected List<Class<? extends ITableControl>> getConfiguredTableControls() {
			// TODO Auto-generated method stub
			return super.getConfiguredTableControls();
		}

		@Override
		protected boolean getConfiguredTableStatusVisible() {
			// TODO Auto-generated method stub
			return super.getConfiguredTableStatusVisible();
		}
		
	}
}
