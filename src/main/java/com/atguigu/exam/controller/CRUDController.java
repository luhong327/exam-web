/**
 * 
 */
package com.atguigu.exam.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.exam.bean.TableCellphone;
import com.atguigu.exam.service.PhoneService;
import com.github.pagehelper.Page;

@Controller
public class CRUDController {
	@Autowired
	PhoneService phoneService;
	@RequestMapping("/removePhone/{phoneId}")
	public void removePhone(@PathVariable("phoneId") Integer phoneId, HttpServletResponse response) throws IOException {
		
		phoneService.removePhone(phoneId);
		
		response.getWriter().write("success");
	}
	@RequestMapping("/savePhone")
	public void savePhone(TableCellphone phone, HttpServletResponse response) throws IOException {
		phoneService.savaPhone(phone);
		
		response.getWriter().write("success");
	}
	@RequestMapping("/updatePhone")
	public void updateEmp(TableCellphone phone, HttpServletResponse response) throws IOException {
		phoneService.updatePhone(phone);
		System.out.println("=="+phone);
		response.getWriter().write("success");
	}
	@RequestMapping("/getPhoneListRemote")
	@ResponseBody
	public List<TableCellphone> getPhoneListRemote() {
		
		List<TableCellphone> list = phoneService.getAllPhone();
		System.out.println(list);
		return list;
	}
	@ResponseBody
	@RequestMapping("/getPhonePageRemote")
	public Map<String, Object> getPhonePageRemote(@RequestParam("page") int pageNum, @RequestParam("rows") int pageSize) {
		
		List<TableCellphone> list = phoneService.getPhonePageList(pageNum, pageSize);
		
		Page<TableCellphone> page = (Page<TableCellphone>) list;
		
		//获取总记录数
		long total = page.getTotal();
		
		//创建Map对象用来存放响应数据
		Map<String, Object> jsonMap = new HashMap<>();
		jsonMap.put("total", total);
		jsonMap.put("rows", list);
		
		return jsonMap;
	}
}
