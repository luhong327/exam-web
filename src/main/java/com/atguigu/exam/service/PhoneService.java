/**
 * 
 */
package com.atguigu.exam.service;

import java.util.List;

import com.atguigu.exam.bean.TableCellphone;

/**
 * @author hn
 *
 */
public interface PhoneService {

	/**
	 *@return
	 *@Enclosing_Method:getAllPhone
	 *@Written by:
	 *@Creation Date:2017年8月2日上午9:29:08
	 *@version:v1.00
	 *@Description:
	 */
	List<TableCellphone> getAllPhone();

	/**
	 *@param pageNum
	 *@param pageSize
	 *@return
	 *@Enclosing_Method:getPhonePageList
	 *@Written by:
	 *@Creation Date:2017年8月2日上午9:56:31
	 *@version:v1.00
	 *@Description:
	 */
	List<TableCellphone> getPhonePageList(int pageNum, int pageSize);

	/**
	 *@param phone
	 *@Enclosing_Method:savaPhone
	 *@Written by:
	 *@Creation Date:2017年8月2日上午10:08:56
	 *@version:v1.00
	 *@Description:
	 */
	int savaPhone(TableCellphone phone);

	/**
	 *@param phoneId
	 *@Enclosing_Method:removePhone
	 *@Written by:
	 *@Creation Date:2017年8月2日上午10:20:04
	 *@version:v1.00
	 *@Description:
	 */
	int removePhone(Integer phoneId);

	/**
	 *@param phone
	 *@Enclosing_Method:updatePhone
	 *@Written by:
	 *@Creation Date:2017年8月2日上午10:27:30
	 *@version:v1.00
	 *@Description:
	 */
	int updatePhone(TableCellphone phone);
	
}
