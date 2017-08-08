package com.atguigu.exam.dao;

import com.atguigu.exam.bean.TableCellphone;
import com.atguigu.exam.bean.TableCellphoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableCellphoneMapper {
    long countByExample(TableCellphoneExample example);

    int deleteByExample(TableCellphoneExample example);

    int deleteByPrimaryKey(Integer phoneId);

    int insert(TableCellphone record);

    int insertSelective(TableCellphone record);

    List<TableCellphone> selectByExample(TableCellphoneExample example);

    TableCellphone selectByPrimaryKey(Integer phoneId);

    int updateByExampleSelective(@Param("record") TableCellphone record, @Param("example") TableCellphoneExample example);

    int updateByExample(@Param("record") TableCellphone record, @Param("example") TableCellphoneExample example);

    int updateByPrimaryKeySelective(TableCellphone record);

    int updateByPrimaryKey(TableCellphone record);
}