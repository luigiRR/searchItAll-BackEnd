package com.project.SearchItAll.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class SearchRepository {
	
	private EntityManager entityManager;
	
	public SearchRepository (EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public List<Object[]> businessType(Map params) throws Exception {
		StringBuilder sb = new StringBuilder();
		List<Object[]> listBusiness = new ArrayList<Object[]>();
		
		sb.append("select  c.id as catrgoryid,b.id as businesstypeid, b.name,c.name from businesstype b ")
		.append("inner join category c on c.id = b.categoryid");
		
		listBusiness = entityManager.createNativeQuery(sb.toString()).getResultList();
		return listBusiness;
	}
}
