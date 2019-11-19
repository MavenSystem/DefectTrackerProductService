package com.Sgic.DefectTracker.ProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sgic.DefectTracker.ProductService.dto.PrivilegeDto;
import com.Sgic.DefectTracker.ProductService.dto.mapper.Mapper;
import com.Sgic.DefectTracker.ProductService.entities.Privilege;
import com.Sgic.DefectTracker.ProductService.service.PrivilegeService;

@RestController
public class PrivilegeController {
	
	@Autowired
	private PrivilegeService privilegeService;
	@Autowired
	private Mapper mapper;
	
	@PostMapping(value="/privilege")
	public ResponseEntity<Object> createSeverity(@RequestBody PrivilegeDto privilegeDto) {
		// if (employeeService.isEmailAlreadyExist(employeeData.getEmail())) {
//		      logger.debug("Email already exists: createEmployee(), email: {}");
//		      return new ResponseEntity<>(new BasicResponse<>(
//		          new ValidationFailure(Constants.EMAIL, errorMessages.getEmailAlreadyExist()),
//		          RestApiResponseStatus.VALIDATION_FAILURE,ValidationMessages.EMAIL_EXIST), HttpStatus.BAD_REQUEST);
		// }
		Privilege privilege = mapper.map(privilegeDto, Privilege.class);
		
		//roleService.createRole(role);
		privilegeService.createPrivilege(privilege);
		return new ResponseEntity<>( HttpStatus.OK);

		}

	}


