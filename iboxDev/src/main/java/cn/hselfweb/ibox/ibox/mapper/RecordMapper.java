package cn.hselfweb.ibox.ibox.mapper;

import cn.hselfweb.ibox.ibox.model.Record;

public interface RecordMapper {
    int insert(Record record);

    int insertSelective(Record record);
}