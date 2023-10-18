package com.project.SearchItAll.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.SearchItAll.dto.BusinessDTO;
import com.project.SearchItAll.dto.GenericResponseDTO;
import com.project.SearchItAll.service.SearchService;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST})
@RequestMapping("api/search")
public class SearchController {
	
	SearchService searchService;
	
	public SearchController(SearchService searchService) {
		this.searchService = searchService;
	}
	
	@GetMapping("/business-type")
	public ResponseEntity businessType(@RequestParam Map params, HttpServletRequest req) {
		try {
			Map response = new HashMap();
			response.put("msg", "respondiendo un string");
			
			GenericResponseDTO<BusinessDTO> business = searchService.businessType(params);
			return new ResponseEntity<>(business, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new HashMap() {{ put("error",e.getMessage()); } }, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
