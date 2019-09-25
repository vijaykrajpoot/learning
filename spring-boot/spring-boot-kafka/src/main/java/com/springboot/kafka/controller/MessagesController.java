package com.springboot.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.kafka.service.KafkaConsumer;
import com.springboot.kafka.service.MessagingService;


@RestController
@RequestMapping("messages")
public class MessagesController {
  
  private final Logger logger = LoggerFactory.getLogger(MessagesController.class);
  
  @Autowired
  private MessagingService messagingService; 
  
  @PostMapping(path="/publish", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
  public void publisMessage(@RequestBody String message) {
    logger.info("publisMessage Invoked:" + message);
    messagingService.publish(message);
      
  }
  
}
