package ask.apps.platform.client.pages;

import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

import ask.apps.platform.client.base.BaseDateColumnDay;
import ask.apps.platform.client.base.BaseDateColumnDayTime;
import ask.apps.platform.client.base.BaseDateColumnYear;
import ask.apps.platform.client.pages.PAQueueTablePage.PAQueueTable;
import ask.apps.platform.shared.rininpatient.IPAQueueService;
import ask.apps.platform.shared.rininpatient.PAQueueTablePageData;

@Data(PAQueueTablePageData.class)
public class PAQueueTablePage extends AbstractPageWithTable<PAQueueTable> {

	@Override
	protected String getConfiguredTitle() {

		return TEXTS.get("PAQueueTablePage");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IPAQueueService.class).getPAQueueTableData(filter));
	}
	
	@Override
	protected boolean getConfiguredLeaf() {
		return true;
	}



	public class PAQueueTable extends AbstractTable {

		@Override
		protected boolean getConfiguredAutoResizeColumns() {
			return true;//super.getConfiguredAutoResizeColumns();
		}

		@Override
		protected boolean getConfiguredMultiSelect() {
			return false; //super.getConfiguredMultiSelect();
		}

		public Document_idColumn getDocument_idColumn() {
			return getColumnSet().getColumnByClass(Document_idColumn.class);
		}

		public Full_nameColumn getFull_NameColumn() {
			return getColumnSet().getColumnByClass(Full_nameColumn.class);
		}

		public BirthyearColumn getBirthyearColumn() {
			return getColumnSet().getColumnByClass(BirthyearColumn.class);
		}

		public Div_name_planColumn getDiv_name_planColumn() {
			return getColumnSet().getColumnByClass(Div_name_planColumn.class);
		}

		public Hosp_date_planColumn getHosp_date_planColumn() {
			return getColumnSet().getColumnByClass(Hosp_date_planColumn.class);
		}

		public Div_name_confirmColumn getDiv_name_confirmColumn() {
			return getColumnSet().getColumnByClass(Div_name_confirmColumn.class);
		}

		public Hosp_date_confirmColumn getHosp_date_confirmColumn() {
			return getColumnSet().getColumnByClass(Hosp_date_confirmColumn.class);
		}

		public Wait_daysColumn getWait_daysColumn() {
			return getColumnSet().getColumnByClass(Wait_daysColumn.class);
		}

		public Call_dirColumn getCall_dirColumn() {
			return getColumnSet().getColumnByClass(Call_dirColumn.class);
		}

		public Call_dateColumn getCall_dateColumn() {
			return getColumnSet().getColumnByClass(Call_dateColumn.class);
		}

		public Call_commentsColumn getCall_commentsColumn() {
			return getColumnSet().getColumnByClass(Call_commentsColumn.class);
		}

		public PhoneColumn getPhoneColumn() {
			return getColumnSet().getColumnByClass(PhoneColumn.class);
		}

		public Queue_numberColumn getQueue_numberColumn() {
			return getColumnSet().getColumnByClass(Queue_numberColumn.class);
		}

		public SexColumn getSexColumn() {
			return getColumnSet().getColumnByClass(SexColumn.class);
		}

		public Show_idColumn getShow_idColumn() {
			return getColumnSet().getColumnByClass(Show_idColumn.class);
		}

		@Order(100)
		public class Document_idColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Document_idColumnName");
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

		@Order(200)
		public class Show_idColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Show_idColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 90;
			}
		}

		@Order(300)
		public class Full_nameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Full_nameColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 200;
			}
		}

		@Order(400)
		public class SexColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("SexColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}

		@Order(500)
		public class BirthyearColumn extends BaseDateColumnYear {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("BirthyearColumnName");
			}
		}

		@Order(2000)
		public class Queue_numberColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Queue_numberColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}

		@Order(3000)
		public class Div_name_planColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Div_name_planColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 70;
			}
		}

		@Order(4000)
		public class Hosp_date_planColumn extends BaseDateColumnDay {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Hosp_date_planColumnName");
			}

		}

		@Order(5000)
		public class Div_name_confirmColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Div_name_confirmColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 70;
			}
		}

		@Order(6000)
		public class Hosp_date_confirmColumn extends BaseDateColumnDayTime {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Hosp_date_confirmColumnName");
			}

		}

		@Order(7000)
		public class Wait_daysColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Wait_daysColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 50;
			}
		}

		@Order(8000)
		public class PhoneColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("PhoneColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 150;
			}
		}

		@Order(9000)
		public class Call_dirColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Call_dirColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(10000)
		public class Call_dateColumn extends BaseDateColumnDayTime {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Call_dateColumnName");
			}
		}

		@Order(11000)
		public class Call_commentsColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Call_commentsColumnName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 200;
			}
		}
		
		
	}
    
}
