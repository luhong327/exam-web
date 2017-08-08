/**
 * 
 */
package com.atguigu.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.exam.bean.TableCellphone;
import com.atguigu.exam.dao.TableCellphoneMapper;
import com.atguigu.exam.service.PhoneService;
import com.github.pagehelper.PageHelper;

@Service
public class PhoneServiceImpl implements PhoneService {
	@Autowired
	TableCellphoneMapper mapper;
	@Override
	public List<TableCellphone> getAllPhone() {
		List<TableCellphone> list = mapper.selectByExample(null);
		return list;
	}
	@Override
	public List<TableCellphone> getPhonePageList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return mapper.selectByExample(null);
	}
	@Override
	public int savaPhone(TableCellphone phone) {
		return mapper.insertSelective(phone);
	}
	@Override
	public int removePhone(Integer phoneId) {
		return mapper.deleteByPrimaryKey(phoneId);
	}
	@Override
	public int updatePhone(TableCellphone phone) {
		return mapper.updateByPrimaryKeySelective(phone);
	}

}
