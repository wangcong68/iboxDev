package cn.hselfweb.ibox.ibox.mapper;

import cn.hselfweb.ibox.ibox.model.Icebox;

public interface IceboxMapper {
    int deleteByPrimaryKey(Integer iceId);

    int insert(Icebox record);

    int insertSelective(Icebox record);

    Icebox selectByPrimaryKey(Integer iceId);

    int updateByPrimaryKeySelective(Icebox record);

    int updateByPrimaryKey(Icebox record);
}