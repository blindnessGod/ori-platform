package com.ori;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ori.mapper.DicBizScenarioscolMapper;
import com.ori.pojo.DicBizScenarioscol;
import com.ori.service.DicService;

@RunWith(SpringRunner.class)
@SpringBootTest
class RightServiceApplicationTests {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	DicService dicService;
	
	@Autowired
	public DicBizScenarioscolMapper d;
	
	@Test
	void contextLoads() throws SQLException {
		DicBizScenarioscol di = new DicBizScenarioscol();
		System.out.println("begin");
        di = dicService.getObject("001");
        System.out.println("end"+di.getBizCd());
	}
	@Test
	void test01()throws Exception{
		d.selectByBizCd("001");
	}
}
