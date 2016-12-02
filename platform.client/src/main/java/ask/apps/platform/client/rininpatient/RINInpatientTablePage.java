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
		
		
		

		public Case_history_idColumn getCase_history_idColumn() {
			return getColumnSet().getColumnByClass(Case_history_idColumn.class);
		}


		@Order(50)
		public class Case_history_idColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Case_history_idColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}

			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}

			@Override
			protected boolean getConfiguredPrimaryKey() {
				return true;
			}
		}

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
				return 70;
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
				return 250;
			}
		}

		public Tempr_mColumn getTempr_mColumn() {
			return getColumnSet().getColumnByClass(Tempr_mColumn.class);
		}


		@Order(300)
		public class Tempr_mColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Tempr_mColumnNmae");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}

			@Override
			public boolean isGroupingActive() {
				// TODO Auto-generated method stub
				return super.isGroupingActive();
			}

			@Override
			public boolean isRemovable() {
				// TODO Auto-generated method stub
				return super.isRemovable();
			}
			
		}

		public DateinColumn getDateinColumn() {
			return getColumnSet().getColumnByClass(DateinColumn.class);
		}


		@Order(400)
		public class DateinColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("DateinColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}

		public DescriptionColumn getDescriptionColumn() {
			return getColumnSet().getColumnByClass(DescriptionColumn.class);
		}


		@Order(500)
		public class DescriptionColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("DescriptionColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}

		public Name_wardColumn getName_wardColumn() {
			return getColumnSet().getColumnByClass(Name_wardColumn.class);
		}


		@Order(600)
		public class Name_wardColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Name_wardColumn");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}

		public DoctorColumn getDoctorColumn() {
			return getColumnSet().getColumnByClass(DoctorColumn.class);
		}


		@Order(700)
		public class DoctorColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("DoctorColumnName");
			}
		
			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}

		public SostColumn getSostColumn() {
			return getColumnSet().getColumnByClass(SostColumn.class);
		}


		@Order(800)
		public class SostColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("SostColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}


		public DataoperationColumn getDataoperationColumn() {
			return getColumnSet().getColumnByClass(DataoperationColumn.class);
		}


		@Order(900)
		public class DataoperationColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("DataoperationColumnName");
			}
		
			@Override
			protected int getConfiguredWidth() {
				return 50;
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
			return super.getConfiguredHeaderEnabled();
		}

		@Override
		protected boolean getConfiguredAutoResizeColumns() {
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
