/**
 * 
 */
package com.ori.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ori.pojo.DicBizScenarioscol;
import com.ori.service.DicService;

/**
 * @author wangkaiqun
 *
 */
@RestController
public class LogicController {
	@Autowired
	public DicService dicService;
	
	@RequestMapping(value="/begin",method = RequestMethod.GET)
	public String beginThread() {
		DicBizScenarioscol d = new DicBizScenarioscol();
		d = dicService.getObject("001");
		return "hello ok "+d.getBizCd();
	}
}
