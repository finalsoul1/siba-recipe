package app.yummy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import app.yummy.common.Pagination;
import app.yummy.service.FoodService;

@CrossOrigin("*")
@RestController
@RequestMapping(value="food")
@PropertySource(value= {"my.properties"})
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@Value("${list.url}")
	private String url;
	
	@RequestMapping("/list")
	public Map<String, Object> getFoodList(@RequestParam(name="page", required=false, defaultValue="1") int page,
			@RequestParam(name="size", required=false, defaultValue="12") int size,
			@RequestParam(name="bsize", required=false, defaultValue="10") int bsize,
			HttpServletRequest req) {
		
		// spel
		// req.getRequestURL().toString()
		
		System.out.println(url);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", foodService.selectFood(page, size));
		map.put("pager", new Pagination(page, size, bsize, foodService.selectTotalCnt(),url));
		return map;
	}
	
	
	@RequestMapping("/detail")
	public Map<String, Object> getFoodDetail(@RequestParam(name="foodId") int foodId) {
		return foodService.selectFoodDetail(foodId);
	}

}
