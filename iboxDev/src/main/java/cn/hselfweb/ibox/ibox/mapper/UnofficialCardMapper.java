package cn.hselfweb.ibox.ibox.mapper;

import cn.hselfweb.ibox.ibox.model.UnofficialCard;

public interface UnofficialCardMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(UnofficialCard record);

    int insertSelective(UnofficialCard record);

    UnofficialCard selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(UnofficialCard record);

    int updateByPrimaryKey(UnofficialCard record);
}