package com.springboot.kafka.model;

import lombok.Data;

@Data 
public class Message {
  
  private String messageContent;
  private String messagesId;
  private String type;
  
  

}
