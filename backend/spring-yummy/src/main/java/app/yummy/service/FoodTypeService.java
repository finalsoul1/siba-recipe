package app.yummy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.yummy.mapper.FoodTypeMapper;
import app.yummy.vo.FoodTypeVO;

@Service
public class FoodTypeService {

	@Autowired
	private FoodTypeMapper foodTypeMapper;
	
	public List<FoodTypeVO> selectFoodType(){
		return foodTypeMapper.selectFoodType();
	}
	
}
