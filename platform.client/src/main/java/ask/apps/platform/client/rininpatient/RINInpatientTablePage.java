package ask.apps.platform.client.rininpatient;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
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
		}
		
	}
}
