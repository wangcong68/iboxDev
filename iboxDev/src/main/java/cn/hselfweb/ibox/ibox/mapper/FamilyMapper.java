package cn.hselfweb.ibox.ibox.mapper;

import cn.hselfweb.ibox.ibox.model.Family;

public interface FamilyMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Family record);

    int insertSelective(Family record);

    Family selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Family record);

    int updateByPrimaryKey(Family record);
}