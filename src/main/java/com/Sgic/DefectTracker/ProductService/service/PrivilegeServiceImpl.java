package com.Sgic.DefectTracker.ProductService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.Sgic.DefectTracker.ProductService.entities.Privilege;
import com.Sgic.DefectTracker.ProductService.repository.PrivilegeRepository;


@Service
public class PrivilegeServiceImpl implements PrivilegeService{

//	@Override
//	public Privilege createPrivilege(Privilege privilege) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Autowired
	private PrivilegeRepository privilegeRepository;
	@Transactional(readOnly = false)
	public Privilege createPrivilege(@RequestBody Privilege privilege) {
		 return privilegeRepository.save(privilege);
		 // return new ResponseEntity<Object>(HttpStatus.OK);
		 }

	}
	
	
	


