package ask.apps.platform.client.rininpatient;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.client.rininpatient.PAQueueTablePage.PAQueueTable;
import ask.apps.platform.shared.rininpatient.IPAQueueService;
import ask.apps.platform.shared.rininpatient.PAQueueTablePageData;

@Data(PAQueueTablePageData.class)
public class PAQueueTablePage extends AbstractPageWithTable<PAQueueTable> {

	@Override
	protected String getConfiguredTitle() {
		// TODO [oleg] verify translation
		return TEXTS.get("PAQueueTablePage");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IPAQueueService.class).getPAQueueTableData(filter));
	}

	public class PAQueueTable extends AbstractTable {

		public Document_idColumn getDocument_idColumn() {
			return getColumnSet().getColumnByClass(Document_idColumn.class);
		}

		public Show_idColumn getShow_idColumn() {
			return getColumnSet().getColumnByClass(Show_idColumn.class);
		}

		@Order(1000)
		public class Document_idColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Document_id");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}

			@Override
			protected boolean getConfiguredVisible() {
				return false;
			}
		}

		@Order(2000)
		public class Show_idColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Show_id");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}
		
	}
    
}
