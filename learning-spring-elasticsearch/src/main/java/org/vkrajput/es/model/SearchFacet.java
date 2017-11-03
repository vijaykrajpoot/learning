package org.vkrajput.es.model;

import org.springframework.data.elasticsearch.core.geo.GeoPoint;

public class SearchFacet {

	private GeoPoint geoPoint;

	private String catalog;

	private String searchRange = "10mi";

	private String searchAnyString;

	private String restarauntOpeningTime;

	private String restarauntClosingTime;
	
	private String cuisineType;

	public SearchFacet() {
		geoPoint = new GeoPoint(37.565359, -122.042346);
	}

	/**
	 * @return the geoPoint
	 */
	public GeoPoint getGeoPoint() {
		return geoPoint;
	}

	/**
	 * @param geoPoint the geoPoint to set
	 */
	public void setGeoPoint(GeoPoint geoPoint) {
		this.geoPoint = geoPoint;
	}

	/**
	 * @return the catalog
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * @param catalog the catalog to set
	 */
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	/**
	 * @return the searchRange
	 */
	public String getSearchRange() {
		return searchRange;
	}

	/**
	 * @param searchRange the searchRange to set
	 */
	public void setSearchRange(String searchRange) {
		this.searchRange = searchRange;
	}

	/**
	 * @return the searchAnyString
	 */
	public String getSearchAnyString() {
		return searchAnyString;
	}

	/**
	 * @param searchAnyString the searchAnyString to set
	 */
	public void setSearchAnyString(String searchAnyString) {
		this.searchAnyString = searchAnyString;
	}

	/**
	 * @return the restarauntOpeningTime
	 */
	public String getRestarauntOpeningTime() {
		return restarauntOpeningTime;
	}

	/**
	 * @param restarauntOpeningTime the restarauntOpeningTime to set
	 */
	public void setRestarauntOpeningTime(String restarauntOpeningTime) {
		this.restarauntOpeningTime = restarauntOpeningTime;
	}

	/**
	 * @return the restarauntClosingTime
	 */
	public String getRestarauntClosingTime() {
		return restarauntClosingTime;
	}

	/**
	 * @param restarauntClosingTime the restarauntClosingTime to set
	 */
	public void setRestarauntClosingTime(String restarauntClosingTime) {
		this.restarauntClosingTime = restarauntClosingTime;
	}

	/**
	 * @return the cuisineType
	 */
	public String getCuisineType() {
		return cuisineType;
	}

	/**
	 * @param cuisineType the cuisineType to set
	 */
	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	
	
}
