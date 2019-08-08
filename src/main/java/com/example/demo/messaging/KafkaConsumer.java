//package com.example.demo.messaging;
//
//import java.nio.charset.Charset;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.messaging.Message;
//import org.springframework.kafka.support.KafkaNull;
//
//import com.example.demo.constants.Constants;
//import com.example.demo.domain.TextMessage;
//
//@EnableBinding(ChannelDefinition.class)
//
//public class KafkaConsumer {
//
//	  @StreamListener(Constants.INPUT_TEXT_MESSAGE)
//	  public void readTextMessaged(Message<?> message) {
//		  if (message.getPayload() instanceof KafkaNull || message.getPayload() == null){
//		      return;
//		      }
//			String payload = null ;
//		    if (message.getPayload() instanceof byte[]) {
//		      payload= new String((byte[]) message.getPayload(), Charset.forName("UTF-8"));
//		    }else {
//		      payload = (String) message.getPayload();
//		      try {
//		    	  TextMessage textMessage = ObjectMapperForTextMessage.getMapper().reader().forType(TextMessage.class).readValue(payload);
//	System.out.println("text message : "+ textMessage.getText());
//		       
//		    } catch (Exception e) {
//
//		    }  }
//			
//			
//
//	}
//}
