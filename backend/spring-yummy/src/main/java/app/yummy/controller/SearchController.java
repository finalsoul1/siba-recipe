package app.yummy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.yummy.service.SearchService;
import app.yummy.vo.FoodVO;

@CrossOrigin("*")
@RestController
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@PostMapping("/search")
	public List<FoodVO> searchResult(@RequestBody Map<String, String> map) {
		System.out.println("foodname: " + map);
		List<FoodVO> result = searchService.searchFood(map.get("sendstring"));
		System.out.println(result);
		return result;
	}
}
