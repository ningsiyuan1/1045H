package com.bw.ser;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.S;
import com.bw.mapper.Dao;

@Service
public class shixianser implements jiekouser{
	@Resource
	private Dao dao;

	public List<S> zhanshi() {
		// TODO Auto-generated method stub
		return dao.zhanshi();
	}

	public S x(Integer id) {
		// TODO Auto-generated method stub
		return dao.x(id);
	}
	
}
