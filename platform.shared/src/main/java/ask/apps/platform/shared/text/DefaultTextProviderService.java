package ask.apps.platform.shared.text;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.services.common.text.AbstractDynamicNlsTextProviderService;

/**
 * <h3>{@link DefaultTextProviderService}</h3>
 *
 * @author oleg
 */
@Order(-2000)
public class DefaultTextProviderService extends AbstractDynamicNlsTextProviderService {
  @Override
public String getDynamicNlsBaseName() {
    return "ask.apps.platform.shared.texts.Texts";
  }
}
