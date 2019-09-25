package com.springboot.kafka.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import lombok.Data;

@Data 
public class Message {
  
  private String messageContent;
  
  
  @Override
  public String toString()
  {
      return ToStringBuilder.reflectionToString(this);
  }

}
