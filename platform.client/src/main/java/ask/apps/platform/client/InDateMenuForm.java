package ask.apps.platform.client;

import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.booleanfield.AbstractBooleanField;
import org.eclipse.scout.rt.client.ui.form.fields.datefield.AbstractDateField;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;

import ask.apps.platform.client.InDateMenuForm.MainBox.GroupBox;
import ask.apps.platform.client.InDateMenuForm.MainBox.GroupBox.InDateCheckField;
import ask.apps.platform.client.InDateMenuForm.MainBox.GroupBox.InDateDateField;


public class InDateMenuForm extends AbstractForm {

	public InDateMenuForm() {
		super();
	}
	
	public String getNewTitle() {
		return getConfiguredTitle();		
	}

	@Override
	protected String getConfiguredTitle() {
		if (getInDateCheckField().isChecked()) {
			return TEXTS.get("InDateSelectedText");
		} else {
			return TEXTS.get("InDateMenuFormTitle");
		}
	}

	@Override
	public void start() {
		startInternal(new ToolHandler());
	}

	public GroupBox getGroupBox() {
		return getFieldByClass(GroupBox.class);
	}

	public InDateDateField getInDateDateField() {
		return getFieldByClass(InDateDateField.class);
	}

	public InDateCheckField getInDateCheckField() {
		return getFieldByClass(InDateCheckField.class);
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	@Order(10)
	public class MainBox extends AbstractGroupBox {

		@Override
		protected int getConfiguredGridColumnCount() {
			return 1;
		}

/*		@Override
		protected int getConfiguredWidthInPixel() {
			return 270;// super.getConfiguredWidthInPixel();
		}
*/		

		@Order(50)
		public class GroupBox extends AbstractGroupBox {

			@Order(1000)
			public class InDateCheckField extends AbstractBooleanField {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("InDateCheckFieldLabel");
				}

				@Override
				protected byte getConfiguredLabelPosition() {
					return LABEL_POSITION_RIGHT;
				}
/*
				@Override
				protected boolean getConfiguredLabelVisible() {
					// TODO Auto-generated method stub
					return true;// super.getConfiguredLabelVisible();
				}*/

				@Override
				protected void execDataChanged(Object... dataTypes) {
					// TODO Auto-generated method stub
//					this.
					super.execDataChanged(dataTypes);
				}
			}

			@Order(2000)
			public class InDateDateField extends AbstractDateField {
				@Override
				protected String getConfiguredLabel() {
					return TEXTS.get("InDateDateFieldLabel");
				}

				@Override
				protected byte getConfiguredLabelPosition() {

					return LABEL_POSITION_ON_FIELD;
				}
				
			}

		}
	}

	public class ToolHandler extends AbstractFormHandler {
	}
}
