package ask.apps.platform.shared.text;

import java.util.Locale;
import java.util.Map;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.services.common.text.ITextProviderService;

@Order(-3000)
public class DisplayKeysProviderService implements ITextProviderService {

	@Override
	public String getText(Locale locale, String key, String... messageArguments) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(key);
		if(messageArguments != null && messageArguments.length > 0){
			sb.append(":");
			boolean needSeparator = false;
			for (String a : messageArguments){
				if (needSeparator){
					sb.append(",");
				}
				sb.append(a);
				needSeparator = true;
			}
		}
		if (locale  != null){
			sb.append(":");
			sb.append(locale.toString());
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public Map<String, String> getTextMap(Locale locale) {
		return null;
	}

}
