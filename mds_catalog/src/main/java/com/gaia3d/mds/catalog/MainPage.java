package com.gaia3d.mds.catalog;

import org.apache.wicket.markup.html.basic.Label;
import org.geoserver.web.GeoServerBasePage;

public class MainPage extends GeoServerBasePage {

	public MainPage() {
		add( new Label( "hellolabel", "Layer Catalog") );
	}
	
}
