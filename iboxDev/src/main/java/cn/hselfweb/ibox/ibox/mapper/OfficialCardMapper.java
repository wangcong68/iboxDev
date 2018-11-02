package cn.hselfweb.ibox.ibox.mapper;

import cn.hselfweb.ibox.ibox.model.OfficialCard;

public interface OfficialCardMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(OfficialCard record);

    int insertSelective(OfficialCard record);

    OfficialCard selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(OfficialCard record);

    int updateByPrimaryKey(OfficialCard record);
}