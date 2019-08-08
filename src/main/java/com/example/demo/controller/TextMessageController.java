//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.domain.TextMessage;
//import com.example.demo.messaging.KafkaProducer;
//
//@RestController
//@RequestMapping("/textmsg")
//
//public class TextMessageController {
//
//	@Autowired
//	private KafkaProducer producer;
//
//	@PostMapping("/addTxtMsg")
//	public void addUser(@RequestBody TextMessage msgToAdd) {
//		producer.send(msgToAdd);
//
//	}
//
//}
