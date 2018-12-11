package app.yummy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.yummy.service.FoodTypeService;
import app.yummy.vo.FoodTypeVO;

@CrossOrigin("*")
@RestController
@RequestMapping(value="foodType")
public class FoodTypeController {

	@Autowired
	private FoodTypeService foodTypeService;
	
	@RequestMapping("/list")
	public List<FoodTypeVO> getFoodTypeList() {
		return foodTypeService.selectFoodType();
	}
	
}


