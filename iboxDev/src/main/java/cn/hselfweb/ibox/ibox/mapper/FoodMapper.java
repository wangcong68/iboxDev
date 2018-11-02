package cn.hselfweb.ibox.ibox.mapper;

import cn.hselfweb.ibox.ibox.model.Food;

public interface FoodMapper {
    int deleteByPrimaryKey(Integer foodId);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer foodId);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);
}