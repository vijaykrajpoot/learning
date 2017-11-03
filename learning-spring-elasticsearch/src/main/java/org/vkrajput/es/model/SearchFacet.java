package org.vkrajput.es.model;

import java.util.Enumeration;

import org.springframework.data.elasticsearch.core.geo.GeoPoint;

public class SearchFacet {

	private GeoPoint geoPoint;

	private String catalog;

	private String searchRange = "10mi";

	private String searchAnyString;

	private String restarauntOpeningTime;

	private String restarauntClosingTime;

	public SearchFacet() {
		geoPoint = new GeoPoint(37.565359, -122.042346);
	}
	
	enum CUISINETYPE 	{
		
		ETHENIC_INDIAN,ETHINIC_CHINESE,MEDETERRANEAN,
		
	}
}
