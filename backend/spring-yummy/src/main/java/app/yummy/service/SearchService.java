package app.yummy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.yummy.mapper.SearchMapper;
import app.yummy.vo.FoodVO;

@Service
public class SearchService {
	
	@Autowired
	private SearchMapper searchMapper;
	
	public List<FoodVO> searchFood(String foodname) {
		return searchMapper.searchFood(foodname);
	}
}
