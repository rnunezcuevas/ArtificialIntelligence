package com.udemy.ai.Service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

	ChatClient chatClient;
	
	public ChatService(ChatClient.Builder chatClient) {
		this.chatClient = chatClient.build();
	}
	
	public String getChatResponse(String input)
	{
		return chatClient.prompt(input)
				.call()
				.chatResponse()
				.getResult()
				.getOutput()
				.getText();
	}
}
