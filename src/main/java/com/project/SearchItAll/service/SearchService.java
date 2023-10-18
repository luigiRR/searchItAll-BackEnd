package com.project.SearchItAll.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.project.SearchItAll.dto.BusinessDTO;
import com.project.SearchItAll.dto.GenericResponseDTO;
import com.project.SearchItAll.repository.SearchRepository;

@Service
public class SearchService implements ISearchService {

	SearchRepository searRepo;
	
	public SearchService(SearchRepository searRepo) {
		this.searRepo = searRepo;
	}
	
	@Override
	public GenericResponseDTO<BusinessDTO> businessType(Map params) throws Exception {
		GenericResponseDTO<BusinessDTO> response = new GenericResponseDTO<>();
		List<Object[]> list = searRepo.businessType(params);
		List<BusinessDTO> listBusinessType = new ArrayList();
		
		for(int i=0; i<list.size(); i++) {
			Object[] item = list.get(i);
			
			BusinessDTO business = BusinessDTO.builder()
					.categoryId(Integer.parseInt(item[0].toString()))
					.businessTypeId(Integer.parseInt(item[1].toString()))
					.businessTypeName(item[2].toString())
					.categoryName(item[3].toString())
					.build();
			listBusinessType.add(business);
		}
		response.setList(listBusinessType);
		return response;
	}

}
