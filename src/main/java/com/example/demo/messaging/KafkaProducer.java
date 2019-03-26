package com.example.demo.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import com.example.demo.domain.TextMessage;

@EnableBinding(ChannelDefinition.class)

public class KafkaProducer {
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

	@Autowired
	private ChannelDefinition channel;

	public void send(TextMessage textMessage) {
		Message<?> message;
		try {
			message = MessageBuilder.withPayload(ObjectMapperForTextMessage.getMapper().writeValueAsString(textMessage))
					.build();
			channel.writeTextMessage().send(message);
		} catch (Exception e) {
			LOGGER.warn(" parse error" + e);
		}

	}
}
