package app.yummy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import app.yummy.vo.RecipeVO;

@Mapper
public interface RecipeMapper {

	List<RecipeVO> selectRecipe(int foodId);
	
}
