package me.jzz.study.soa.tuscany.test;

import me.jzz.study.soa.tuscany.service.AccountService;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


public class AccountTest {
	@Test
    public void testTuscany()  
    {  
        SCADomain scaDomain = SCADomain.newInstance("AccountService.composite");  // 配置文件
        AccountService accountService = scaDomain.getService(AccountService.class, "AccountComponent"); // 注册组件
        assertEquals("100.0", accountService.queryReaming(""));
        scaDomain.close();  
    } 
}
