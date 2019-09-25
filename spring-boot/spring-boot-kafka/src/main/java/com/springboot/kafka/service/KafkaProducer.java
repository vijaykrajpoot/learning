package com.springboot.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import com.springboot.kafka.model.Message;

@Component
public class KafkaProducer {
  private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
  
  @Autowired
  KafkaTemplate<String, Message> kafkaTemplate;
  
  private static final String TOPIC = "messsage";
  
  public void publish(Message message) {
    logger.info(String.format("#### -> Published message -> %s", message));
    kafkaTemplate.send(TOPIC,message);
    
  }
  
}
