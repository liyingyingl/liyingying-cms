package com.liyingying.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyingying.dao.ChannelMapper;
import com.liyingying.bean.Channel;
import com.liyingying.service.ChannelService;

/**
 * 
 * @author lyy
 *
 */

@Service
public class ChannelServiceImpl  implements ChannelService{
	
	@Autowired
	ChannelMapper channelMapper;

	@Override
	public List<Channel> list() {
		// TODO Auto-generated method stub
		return channelMapper.list();
	}

}

