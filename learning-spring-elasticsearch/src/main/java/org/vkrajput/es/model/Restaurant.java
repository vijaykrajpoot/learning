package org.vkrajput.es.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

@Document(indexName = "learning", type = "restaurant")
public class Restaurant {

	@Id
	private Long id;
	private String restaurantName;
	private String restaurantSeatingCapacity;
	private boolean isSittingAllowed;
	private CuisineType cuisineType;
	private String restarauntOpeningTime;
	private String restarauntClosingTime;
	
	private GeoPoint geoPoint;
	
	public Restaurant() {

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
	 * @return the restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}

	/**
	 * @param restaurantName
	 *            the restaurantName to set
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	/**
	 * @return the restaurantSeatingCapacity
	 */
	public String getRestaurantSeatingCapacity() {
		return restaurantSeatingCapacity;
	}

	/**
	 * @param restaurantSeatingCapacity
	 *            the restaurantSeatingCapacity to set
	 */
	public void setRestaurantSeatingCapacity(String restaurantSeatingCapacity) {
		this.restaurantSeatingCapacity = restaurantSeatingCapacity;
	}

	/**
	 * @return the isSittingAllowed
	 */
	public boolean isSittingAllowed() {
		return isSittingAllowed;
	}

	/**
	 * @param isSittingAllowed
	 *            the isSittingAllowed to set
	 */
	public void setSittingAllowed(boolean isSittingAllowed) {
		this.isSittingAllowed = isSittingAllowed;
	}

	/**
	 * @return the cuisineType
	 */
	public CuisineType getCuisineType() {
		return cuisineType;
	}

	/**
	 * @param cuisineType
	 *            the cuisineType to set
	 */
	public void setCuisineType(CuisineType cuisineType) {
		this.cuisineType = cuisineType;
	}

	/**
	 * @return the restarauntOpeningTime
	 */
	public String getRestarauntOpeningTime() {
		return restarauntOpeningTime;
	}

	/**
	 * @param restarauntOpeningTime
	 *            the restarauntOpeningTime to set
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
	 * @param restarauntClosingTime
	 *            the restarauntClosingTime to set
	 */
	public void setRestarauntClosingTime(String restarauntClosingTime) {
		this.restarauntClosingTime = restarauntClosingTime;
	}

}
