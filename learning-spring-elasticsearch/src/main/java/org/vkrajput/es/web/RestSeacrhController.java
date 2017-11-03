package org.vkrajput.es.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vkrajput.es.facade.RestaurantFacade;

@RequestMapping("v1/search/restaraunt/")
@RestController
public class RestSeacrhController {

	private final static Logger logger = LoggerFactory.getLogger(RestSeacrhController.class);

	@Autowired
	private RestaurantFacade restaurantFacade;

	@Autowired
	ElasticsearchOperations operations;

	
	
	
	
}
