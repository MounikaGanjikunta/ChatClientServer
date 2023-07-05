package com.web.chatwebservice;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ChatRepository extends CrudRepository<Chat, Integer>{
	
	@Query(value= "select * from chat order by id desc limit 10",nativeQuery = true)
	public List<Chat> getLatest10Chats();

}
