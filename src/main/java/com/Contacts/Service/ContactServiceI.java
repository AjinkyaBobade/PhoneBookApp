package com.Contacts.Service;

import java.util.List;

import com.Contacts.Model.Contact;

public interface ContactServiceI {

	boolean savecontact(Contact contact);
	
	List<Contact> getAllcontact();
	
	Contact getcontactbyid(Integer cid);
	
	public boolean updatecontact(Contact contact);
	
	boolean deletebyid(Integer cid);
}
