package com.udemy.ai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.ai.Service.ChatService;

@RestController
public class ChatController {
	
	@Autowired
	ChatService chatService;
	
	@GetMapping("/chat/{prompt}")
	public String chat(@PathVariable("prompt") String prompt)
	{
		return chatService.getChatResponse(prompt);
		
	}
	
}
