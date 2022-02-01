package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

@RestController
public class BookController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/addContact")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addContact(@RequestBody @Valid Contact contact) {
		contactService.addContact(contact);
	}

}
