package com.springboot.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.kafka.model.Message;

@Service
public class MessagingService {
  
  @Autowired
  private KafkaProducer kafkaProducer;
  
  @Autowired
  private KafkaConsumer kafkaListener;
  
  public void publish(Message message) {
    
    kafkaProducer.publish(message);
    
  }
  
public void consumer(String message) {
    
  //kafkaListener.
    
  }

}
