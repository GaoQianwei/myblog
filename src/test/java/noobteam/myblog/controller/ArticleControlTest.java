package noobteam.myblog.controller;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ArticleControlTest {

    /**
     * 模拟客户端浏览器向服务器发送请求
     */
    @Resource
    private MockMvc mockMvc;
    @org.junit.Test
    public void findAll() {
    }

    @org.junit.Test
    public void save() throws Exception {
        MockHttpServletRequestBuilder builder=
                MockMvcRequestBuilders.post("/art_save")
                        .param("target","1111100000")
                        .param("link","sakfj")
                        .param("date","2020-06-20");
        MvcResult rst=mockMvc.perform(builder).andReturn();
        String str=rst.getResponse().getContentAsString(Charset.forName("UTF-8"));
        System.out.println(str);
    }

    @org.junit.Test
    public void delete() throws Exception {
        //构建一个请求对象，get请求
        MockHttpServletRequestBuilder builder=
                MockMvcRequestBuilders.post("/art_delete")
                        .param("id","2");
        //使用mockmvc发送请求，并获取响应
        MvcResult rst=mockMvc.perform(builder).andReturn();
        //从响应结果中获取其中的内容
        String str=rst.getResponse().getContentAsString(Charset.forName("utf-8"));
        System.out.println(str);
    }
}