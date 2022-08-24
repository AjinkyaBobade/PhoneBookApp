package com.Contacts.Service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Contacts.Model.Contact;
import com.Contacts.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactServiceI{

	@Autowired
	private ContactRepository contactRepository;
	@Override
	public boolean savecontact(Contact contact) {
		
		Contact save = contactRepository.save(contact);
		
		if(save!=  null) {
			
			return true;
		}else {
		return false;
		}
	}

	@Override
	public List<Contact> getAllcontact() {
//		List<Contact> findAll = contactRepository.findAll();
//		
//		Stream<Contact> stream = findAll.stream();
//		
//		stream.filter(contact -> contact)
		
		
		return null;
	}

	@Override
	public Contact getcontactbyid(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatecontact(Contact contact) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletebyid(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
