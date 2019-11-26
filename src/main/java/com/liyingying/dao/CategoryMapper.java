package com.liyingying.dao;

import java.util.List;

import com.liyingying.bean.Category;

public interface CategoryMapper {

	/**
	 * 获取分类
	 * @param chnId
	 * @return
	 */
	List<Category> listByChannelId(int chnId);
	

}
