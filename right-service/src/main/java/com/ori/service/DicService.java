/**
 * 
 */
package com.ori.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ori.mapper.DicBizScenarioscolMapper;
import com.ori.pojo.DicBizScenarioscol;

/**
 * @author wangkaiqun
 *
 */
@Service
public class DicService {
	@Autowired
	public DicBizScenarioscolMapper dicBizScenarioscolMapper;
	
	
	public DicBizScenarioscol getObject(String bizCd) {
		DicBizScenarioscol d = dicBizScenarioscolMapper.selectByBizCd(bizCd);
		System.out.println(d.getBizCd());
		return d;
	}
	
	public int deleteByPrimaryKey(Integer bizId) {
		return dicBizScenarioscolMapper.deleteByPrimaryKey(bizId);
	}
}
