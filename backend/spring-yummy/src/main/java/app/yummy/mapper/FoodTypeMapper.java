package app.yummy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import app.yummy.vo.FoodTypeVO;

@Mapper
public interface FoodTypeMapper {
	List<FoodTypeVO> selectFoodType();
}
