package noobteam.myblog.service.Gao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class perInformationServiceTest {

    @Resource
    private perInformationService perInformationService;

    @Test
    public void doUpdate() {
        Map<String,String>map=new HashMap<>();
        map.put("id","2");
        map.put("signature","三又回来了");
        map.put("sex","男");
        map.put("birth","10");
        map.put("email","296979@qq.com");
        map.put("description","有些需要说的");
        map.put("mood","好");
        boolean n=perInformationService.doUpdate(map);
        assertTrue(n);
    }
}