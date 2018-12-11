package app.yummy.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import app.yummy.vo.FoodVO;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FoodServiceTest {

	@Autowired
	private FoodService foodService;
	
	//@Test
	public void testSelectFood() {

		List<FoodVO> foodList = foodService.selectFood(1,10);
		for(FoodVO fvo: foodList) {
			System.out.println(fvo);
		}
	}
	
	//@Test
	public void testSelectTotalCnt() {
		long temp = foodService.selectTotalCnt();
		System.out.println(temp);
	}
	
	@Test
	public void testselectFoodDetail() {
		Map<String, Object> result = foodService.selectFoodDetail(3);
		result.forEach((key,value) -> System.out.println(value.toString()));
	}

}
