package com.liyingying.service;

import java.util.List;

import javax.validation.Valid;

import com.github.pagehelper.PageInfo;
import com.liyingying.bean.Collect;

/**
 *  收藏
 * @author lyy
 *
 */
public interface CollectService {

	/**
	 * 
	 * @param collect
	 * @return
	 */
	int add(Collect collect);
	/**
	 * 
	 * @param page
	 * @return
	 */
	PageInfo list(int userId,int page);
	/**
	 * 
	 * @param id
	 * @return
	 */
	int delete(int id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Collect get(int id);
	
	/**
	 * 
	 * @param collect
	 * @return
	 */
	int update( Collect collect);
	
	List<Collect> selectObjects();

}
