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

		return TEXTS.get("RINInpatiente");
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

		public Show_id_Column getShow_id_Column() {
			return getColumnSet().getColumnByClass(Show_id_Column.class);
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

		@Order(1000)
		public class Show_id_Column extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Show_id");
			}

			@Override
			protected int getConfiguredWidth() {
				return 160;
			}

			@Override
			protected int getConfiguredMaxLength() {
				// TODO Auto-generated method stub
				return super.getConfiguredMaxLength();
			}

			@Override
			protected boolean getConfiguredInputMasked() {
				// TODO Auto-generated method stub
				return super.getConfiguredInputMasked();
			}

			@Override
			protected String getConfiguredDisplayFormat() {
				// TODO Auto-generated method stub
				return super.getConfiguredDisplayFormat();
			}

			@Override
			protected boolean getConfiguredTextWrap() {
				// TODO Auto-generated method stub
				return super.getConfiguredTextWrap();
			}

			@Override
			protected String getConfiguredFormat() {
				// TODO Auto-generated method stub
				return super.getConfiguredFormat();
			}

			@Override
			protected boolean getConfiguredSelectAllOnEdit() {
				// TODO Auto-generated method stub
				return super.getConfiguredSelectAllOnEdit();
			}

			@Override
			protected boolean getConfiguredUiSortPossible() {
				// TODO Auto-generated method stub
				return super.getConfiguredUiSortPossible();
			}

			@Override
			protected boolean getConfiguredVisible() {
				// TODO Auto-generated method stub
				return super.getConfiguredVisible();
			}

			@Override
			protected String getConfiguredHeaderTooltipText() {
				// TODO Auto-generated method stub
				return super.getConfiguredHeaderTooltipText();
			}

			@Override
			protected String getConfiguredHeaderIconId() {
				// TODO Auto-generated method stub
				return super.getConfiguredHeaderIconId();
			}

			@Override
			protected String getConfiguredHeaderCssClass() {
				// TODO Auto-generated method stub
				return super.getConfiguredHeaderCssClass();
			}

			@Override
			protected String getConfiguredHeaderForegroundColor() {
				// TODO Auto-generated method stub
				return super.getConfiguredHeaderForegroundColor();
			}

			@Override
			protected String getConfiguredHeaderBackgroundColor() {
				// TODO Auto-generated method stub
				return super.getConfiguredHeaderBackgroundColor();
			}

			@Override
			protected String getConfiguredHeaderFont() {
				// TODO Auto-generated method stub
				return super.getConfiguredHeaderFont();
			}

			@Override
			protected boolean getConfiguredFixedWidth() {
				// TODO Auto-generated method stub
				return true;//super.getConfiguredFixedWidth();
			}

			@Override
			protected boolean getConfiguredDisplayable() {
				// TODO Auto-generated method stub
				return super.getConfiguredDisplayable();
			}

			@Override
			protected boolean getConfiguredPrimaryKey() {
				// TODO Auto-generated method stub
				return super.getConfiguredPrimaryKey();
			}

			@Override
			protected boolean getConfiguredEditable() {
				// TODO Auto-generated method stub
				return super.getConfiguredEditable();
			}

			@Override
			protected boolean getConfiguredSummary() {
				// TODO Auto-generated method stub
				return super.getConfiguredSummary();
			}

			@Override
			protected String getConfiguredCssClass() {
				// TODO Auto-generated method stub
				return super.getConfiguredCssClass();
			}

			@Override
			protected boolean getConfiguredHtmlEnabled() {
				// TODO Auto-generated method stub
				return super.getConfiguredHtmlEnabled();
			}

			@Override
			protected String getConfiguredForegroundColor() {
				// TODO Auto-generated method stub
				return super.getConfiguredForegroundColor();
			}

			@Override
			protected String getConfiguredBackgroundColor() {
				// TODO Auto-generated method stub
				return super.getConfiguredBackgroundColor();
			}

			@Override
			protected String getConfiguredFont() {
				// TODO Auto-generated method stub
				return super.getConfiguredFont();
			}

			@Override
			protected boolean getConfiguredGrouped() {
				// TODO Auto-generated method stub
				return super.getConfiguredGrouped();
			}

			@Override
			protected int getConfiguredSortIndex() {
				// TODO Auto-generated method stub
				return super.getConfiguredSortIndex();
			}

			@Override
			protected double getConfiguredViewOrder() {
				// TODO Auto-generated method stub
				return super.getConfiguredViewOrder();
			}

			@Override
			protected boolean getConfiguredSortAscending() {
				// TODO Auto-generated method stub
				return super.getConfiguredSortAscending();
			}

			@Override
			protected boolean getConfiguredAlwaysIncludeSortAtBegin() {
				// TODO Auto-generated method stub
				return super.getConfiguredAlwaysIncludeSortAtBegin();
			}

			@Override
			protected boolean getConfiguredAlwaysIncludeSortAtEnd() {
				// TODO Auto-generated method stub
				return super.getConfiguredAlwaysIncludeSortAtEnd();
			}

			@Override
			protected int getConfiguredHorizontalAlignment() {
				// TODO Auto-generated method stub
				return super.getConfiguredHorizontalAlignment();
			}

			@Override
			protected boolean getConfiguredAutoOptimizeWidth() {
				// TODO Auto-generated method stub
				return true;//super.getConfiguredAutoOptimizeWidth();
			}

			@Override
			protected boolean getConfiguredMandatory() {
				// TODO Auto-generated method stub
				return true;//super.getConfiguredMandatory();
			}
		}
		
	}
}
