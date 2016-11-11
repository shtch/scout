/*******************************************************************************
 * Copyright (c) 2015 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package ask.apps.platform.server.sql;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.config.CONFIG;
import org.eclipse.scout.rt.server.jdbc.oracle.AbstractOracleSqlService;

import ask.apps.platform.server.sql.DatabaseProperties.JdbcMappingNameProperty;
import ask.apps.platform.server.sql.DatabaseProperties.JdbcPasswordProperty;
import ask.apps.platform.server.sql.DatabaseProperties.JdbcUserNameProperty;

@Order(1950)
// tag::service[]
public class OracleSqlService extends AbstractOracleSqlService {

	@Override
	protected String getConfiguredJdbcMappingName() {
		String mappingName = CONFIG.getPropertyValue(JdbcMappingNameProperty.class);

		return mappingName;
	}
	// end::service[]
// tag::service[]
	@Override
	protected String getConfiguredUsername() {
		String userName = CONFIG.getPropertyValue(JdbcUserNameProperty.class);

		return userName;
	}
	// end::service[]
// tag::service[]
	@Override
	protected String getConfiguredPassword() {
		String passWord = CONFIG.getPropertyValue(JdbcPasswordProperty.class);

		return passWord;
	}
}
// end::service[]
