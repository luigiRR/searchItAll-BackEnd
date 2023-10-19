package com.project.SearchItAll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class BusinessDTO {

	Integer categoryId;
	Integer businessTypeId;
	Integer businessId;
	
	String categoryName;
	String businessTypeName;
	String businessName;
	
	String address;
	String numberphone;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	String createAt;
	
	String comment1;
}
