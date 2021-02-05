package com.blog.yeonji;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.blog.yeonji.introduce.home.controller.IntroduceHomeController;

 
public class ControllerTest extends Configure {
    
    @Autowired
    IntroduceHomeController userController;
    
    private MockMvc mockMvc;
    
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));
    
    @Before 
    public void setUp() throws Exception {
         mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }
    
    @Test
    public void testUserController() throws Exception {
        // login check
    	mockMvc.perform(get("/")).andDo(print());
       // mockMvc.perform(get("/").param("id", "cjung")).andExpect(status().isOk());
        
        // 비밀번호 찾기 확인
        // System.out.println(mockMvc.perform(post("/user/password/find").param("id", "cjung")).andDo(print()));
        
        /* ObjectMapper mapper = new ObjectMapper();
         * this.mockMvc.perform(post(UserController.URL_USER_CREATE)
                .contentType(contentType)
                .content(mapper.writeValueAsString(new User("wedul"))))
                .andExpect(status().isOk())
                .andDo(print());*/
    }
 
}

