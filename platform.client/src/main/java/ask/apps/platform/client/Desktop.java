package ask.apps.platform.client;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.scout.rt.client.session.ClientSessionProvider;
import org.eclipse.scout.rt.client.ui.action.keystroke.IKeyStroke;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.desktop.AbstractDesktop;
import org.eclipse.scout.rt.client.ui.desktop.bookmark.menu.AbstractBookmarkMenu;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutlineViewButton;
import org.eclipse.scout.rt.client.ui.desktop.outline.IOutline;
import org.eclipse.scout.rt.client.ui.form.AbstractFormMenu;
import org.eclipse.scout.rt.client.ui.form.ScoutInfoForm;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.context.PropertyMap;
import org.eclipse.scout.rt.shared.TEXTS;

import ask.apps.platform.client.search.SearchOutline;
import ask.apps.platform.client.work.MainOutline;
import ask.apps.platform.shared.Icons;

/**
 * <h3>{@link Desktop}</h3>
 *
 * @author oleg
 */
public class Desktop extends AbstractDesktop {

	  @Override
	  protected String getConfiguredDisplayStyle() {
	    return resolveDesktopStyle();
	  }
	  
	  /**
	   * Returns the 'desktopStyle' provided as part of the URL, or the default style otherwise.<br/>
	   * E.g. http://[host:port]/?desktopStyle=BENCH to start in bench mode.
	   */
	  protected String resolveDesktopStyle() {
	    String desktopStyle = PropertyMap.CURRENT.get().get("desktopStyle");
	    if (desktopStyle != null) {
	      return desktopStyle.toLowerCase();
	    }
	    else {
	      return DISPLAY_STYLE_DEFAULT;
	    }
	  }
	  
	@Override
	protected List<Class<? extends IOutline>> getConfiguredOutlines() {
	    List<Class<? extends IOutline>> outlines = new ArrayList<Class<? extends IOutline>>();
	    outlines.add(MainOutline.class);
	    outlines.add(SearchOutline.class);
	    return outlines;
		
		
//		return CollectionUtility.<Class<? extends IOutline>>arrayList(WorkOutline.class, SearchOutline.class,
//				SettingsOutline.class);
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("ApplicationTitle");
	}

	@Override
	protected String getConfiguredLogoId() {
		return Icons.AppLogo;
	}

/*
	@Override
	protected void execGuiAttached() {
		super.execGuiAttached();
		selectFirstVisibleOutline();
	}

	protected void selectFirstVisibleOutline() {
		for (IOutline outline : getAvailableOutlines()) {
			if (outline.isEnabled() && outline.isVisible()) {
				setOutlineInternal(outline);
				outline.resetOutline();
				break;
			}
		}
	}
*/
	
	@Override
	protected boolean getConfiguredNavigationHandleVisible() {
		return false;//super.getConfiguredNavigationHandleVisible();
	}

	@Order(900)
	public class InDateMenu extends AbstractFormMenu<InDateMenuForm> {
		@Override
		protected String getConfiguredText() {
			return TEXTS.get("InDateMenuText");
		}

		@Override
		protected Class<InDateMenuForm> getConfiguredForm() {

			return InDateMenuForm.class;
		}
	}

	@Order(1000)
	public class FileMenu extends AbstractMenu {

		@Override
		protected String getConfiguredText() {
			return TEXTS.get("File");
		}

		@Order(1000)
		public class ExitMenu extends AbstractMenu {

			@Override
			protected String getConfiguredText() {
				return TEXTS.get("Exit");
			}

			@Override
			protected void execAction() {
				ClientSessionProvider.currentSession(ClientSession.class).stop();
			}
		}
	}

	@Order(2000)
	public class BookmarkMenu extends AbstractBookmarkMenu {

		public BookmarkMenu() {
			super(Desktop.this);
		}
	}

	@Order(3000)
	public class HelpMenu extends AbstractMenu {

		@Override
		protected String getConfiguredText() {
			return TEXTS.get("Help");
		}
	}

	@Order(4000)
	public class UserMenu extends AbstractMenu {
	    @Override
	    protected String getConfiguredIconId() {
	      return "User";//AbstractIcons.User;
	    }
	    //end::DesktopInit[]

	    @Override
	    protected String getConfiguredKeyStroke() {
	      return IKeyStroke.F12;
	    }

	    @Override
	    protected void execInitAction() {
//	      setText(ISession.CURRENT.get().getTexts().toString());//.getUserId());
	      setText("Регистратор");
	    }

		@Order(4100)
		public class ExitMenu extends AbstractMenu {
		
			@Override
			protected String getConfiguredText() {
				return TEXTS.get("Exit");
			}
		
			@Override
			protected void execAction() {
				ClientSessionProvider.currentSession(ClientSession.class).stop();
			}
		}

		@Order(42000)
		public class AboutMenu extends AbstractMenu {
		
			@Override
			protected String getConfiguredText() {
				return TEXTS.get("About");
			}
		
			@Override
			protected void execAction() {
				ScoutInfoForm form = new ScoutInfoForm();
				form.startModify();
			}
		}

	    
	}

	@Order(1000)
	public class WorkOutlineViewButton extends AbstractOutlineViewButton {

		public WorkOutlineViewButton() {
			this(MainOutline.class);
		}

		protected WorkOutlineViewButton(Class<? extends MainOutline> outlineClass) {
			super(Desktop.this, MainOutline.class);
		}

		@Override
		protected String getConfiguredKeyStroke() {
			return IKeyStroke.F2;
		}
	}

	@Order(2000)
	public class SearchOutlineViewButton extends AbstractOutlineViewButton {

		public SearchOutlineViewButton() {
			this(SearchOutline.class);
		}

		protected SearchOutlineViewButton(Class<? extends SearchOutline> outlineClass) {
			super(Desktop.this, outlineClass);
		}

		@Override
		protected DisplayStyle getConfiguredDisplayStyle() {
			return DisplayStyle.TAB;
		}

		@Override
		protected String getConfiguredKeyStroke() {
			return IKeyStroke.F3;
		}
	}

/*
	@Order(3000)
	public class SettingsOutlineViewButton extends AbstractOutlineViewButton {

		public SettingsOutlineViewButton() {
			this(SettingsOutline.class);
		}

		protected SettingsOutlineViewButton(Class<? extends SettingsOutline> outlineClass) {
			super(Desktop.this, outlineClass);
		}

		@Override
		protected DisplayStyle getConfiguredDisplayStyle() {
			return DisplayStyle.TAB;
		}

		@Override
		protected String getConfiguredKeyStroke() {
			return IKeyStroke.F10;
		}
	}
*/	
}
