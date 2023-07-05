package com.web.chatwebservice;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatWebServiceController {
	
	@Autowired
	ChatRepository repo;
	
	@PostMapping("sendchat")
	public List<Chat> saveChatAndGetRecent10Chats(@RequestBody ClientRequest request){
		
		
		
		Chat chat = new Chat();
		chat.setName(request.getName());
		chat.setMessage(request.getMessage());
		chat.setDate(new SimpleDateFormat("MM-dd-yyyy hh:mm:ss").format(new Date()));
		repo.save(chat);
		
		
		return repo.getLatest10Chats();
	}
	

}
