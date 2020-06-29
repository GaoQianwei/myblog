package noobteam.myblog.controller.Gao;
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
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class perInformationControllerTest {

    /**
     * 模拟客户端浏览器向服务器发送请求
     */
    @Resource
    private MockMvc mockMvc;

    @Test
    public void update() throws Exception{

        MockHttpServletRequestBuilder builder=
                MockMvcRequestBuilders.post("/save")
                        .param("id","2")
                        .param("signature","2233");
        MvcResult rst=mockMvc.perform(builder).andReturn();
        String str=rst.getResponse().getContentAsString(StandardCharsets.UTF_8);
        System.out.println(str);

    }
}