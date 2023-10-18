package com.project.SearchItAll.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GenericResponseDTO<T> {

	int total;
	int page;
	int xpage;
	
	List<T> list;
}
