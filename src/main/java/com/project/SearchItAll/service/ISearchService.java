package com.project.SearchItAll.service;

import java.util.Map;

import com.project.SearchItAll.dto.BusinessDTO;
import com.project.SearchItAll.dto.GenericResponseDTO;

public interface ISearchService {

	public GenericResponseDTO<BusinessDTO> businessType(Map params) throws Exception;
}
