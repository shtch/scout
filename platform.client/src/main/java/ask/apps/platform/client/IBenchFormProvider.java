package ask.apps.platform.client;
//package org.eclipse.scout.widgets.client.ui.desktop;

import org.eclipse.scout.rt.client.ui.form.IForm;

/**
 * Provides a form instance which is displayed when Desktop is in bench-only mode.
 */
public interface IBenchFormProvider {

  IForm provideForm();

}
