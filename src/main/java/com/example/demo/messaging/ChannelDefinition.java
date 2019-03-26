package com.example.demo.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

import com.example.demo.constants.Constants;

/**
 *
 * The interface in which we declare the channels for the topics
 */
public interface ChannelDefinition {

  @Input(Constants.INPUT_TEXT_MESSAGE)
  public MessageChannel readTextMessage();

  @Output(Constants.OUTPUT_TEXT_MESSAGE)
  public MessageChannel writeTextMessage();



}
