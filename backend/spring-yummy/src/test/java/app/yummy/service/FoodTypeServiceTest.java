package app.yummy.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import app.yummy.vo.FoodTypeVO;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FoodTypeServiceTest {

	@Autowired
	private FoodTypeService foodTypeService;
	
	@Test
	public void testSelectFoodType() {
		List<FoodTypeVO> list = foodTypeService.selectFoodType();
		for(FoodTypeVO ftvo: list) {
			System.out.println(ftvo.getId());
			System.out.println(ftvo.getName());
		}
		
	}

}
