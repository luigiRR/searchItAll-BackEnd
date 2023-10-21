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

	public List<Object[]> categories(Map params) {
		StringBuilder sb = new StringBuilder();
		List<Object[]> listCategories = new ArrayList<Object[]>();
		
		sb.append("select  c.id as catrgoryid,c.name,c.comment1 from category c ");
		
		listCategories = entityManager.createNativeQuery(sb.toString()).getResultList();
		return listCategories;
	}
	
	public List<Object[]> getBusinessForType(Map params) throws Exception {
		StringBuilder sb = new StringBuilder();
		List<Object[]> listCategories = new ArrayList<Object[]>();
		
		Integer categoryId = Integer.parseInt(params.get("categoryId").toString());
		Integer businessTypeId = Integer.parseInt(params.get("businessTypeId").toString());
		
		sb.append("select b.id as businessid, bt.id as businesstypeid, c.id as categoryid,b.name ,b.address ,b.numberphone,bt.name,c.name ")
		.append("from business b ")
		.append("inner join businesstype bt on bt.id = b.businesstypeid ")
		.append("inner join category c on c.id = bt.categoryid ")
		.append("where c.id = "+categoryId+" and bt.id ="+businessTypeId+"");
		
		listCategories = entityManager.createNativeQuery(sb.toString()).getResultList();
		return listCategories;
	}
}
