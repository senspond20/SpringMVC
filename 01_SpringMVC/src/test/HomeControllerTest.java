package com.senshig.myapp;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit5ClassRunner.class)
//xml 설정을 읽어 스프링 테스트 시작 전 빈 초기화 및 스프링 설정 업로드
//@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml", "file:src/main/webapp/WEB-INF/spring-config/dispatcher-servlet.xml"}) 
@WebAppConfiguration	// WebApplicationContext를 생성할 수 있도록 하는 어노테이션
@WebMvcTest(controllers = HomeController.class)

class HomeControllerTest {
	
	private WebApplicationContext context; // MockMvc 객체 생성을 위한 context
    private MockMvc mockMvc;
    
	@Autowired
	private HomeController testController;
	
    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(testController).build();     // test를 위한 MockMvc 객체 생성. testController 1개만 주입.
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();  // test를 위한 MockMvc 객체 생성. 스프링이 로드한 WebApplicationContext의 인스턴스로 작동.(standaloneSetup() 중 택 1)
    }
    
	@Test
	void test() {
//		fail("Not yet implemented");
		mvc.perform(get("/300"))
			.addExpect(status().isOk());
	}

}
