package org.vkrajput.es.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

@Document(indexName="learning", type="restaurant")
public class Restaurant {
	
	@Id
	private Long id;
	
	private String restaurantName;
	private String restaurantSittingCapacity;
	private boolean isSittingAllowed;
	private String cuisineType;
	
	public Restaurant() {
		
	}

}
	