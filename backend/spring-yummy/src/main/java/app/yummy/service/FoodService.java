package app.yummy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.yummy.mapper.FoodMapper;
import app.yummy.mapper.RecipeMapper;
import app.yummy.vo.FoodVO;
import app.yummy.vo.RecipeVO;

@Service
public class FoodService {
	
	@Autowired
	private FoodMapper foodMapper;
	
	@Autowired
	private RecipeMapper recipeMapper;
	
	public List<FoodVO> selectFood(int page, int size) {
		return foodMapper.selectFood(page, size);
	}
	
	public int selectTotalCnt() {
		return foodMapper.selectTotalCnt();
	}
	
	public Map<String, Object> selectFoodDetail(int foodId) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("food",foodMapper.selectFoodDetail(foodId));
		map.put("recipes",recipeMapper.selectRecipe(foodId));
		
		return map;
	}

}
