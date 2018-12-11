package app.yummy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import app.yummy.vo.FoodVO;



@Mapper
public interface FoodMapper {
	List<FoodVO> selectFood(@Param("page") int page, @Param("size") int size);
	
	int selectTotalCnt();
	
	FoodVO selectFoodDetail(int foodId);
}
