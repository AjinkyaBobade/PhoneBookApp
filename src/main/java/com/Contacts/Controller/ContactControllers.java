package com.Contacts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Contacts.Model.Contact;
import com.Contacts.Service.ContactServiceI;

@RestController
public class ContactControllers {

	@Autowired
	private ContactServiceI contactServiceI;
	
	@PostMapping(value = "/savecontact",consumes = "application/json")
	public ResponseEntity<String> savecontact(@RequestBody Contact contact){
		
		boolean savecontact = contactServiceI.savecontact(contact);
		
		if(savecontact == true) {
			
			return new ResponseEntity<String>("Contact Save Sucessfully",HttpStatus.CREATED);
		}else {
		
		return new ResponseEntity<String>("Contact not Saved Sucessfully",HttpStatus.BAD_REQUEST);
		}
		
		
		
	}
}
