package noobteam.myblog.service.Bao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ArticleServiceTest {

    @Resource
    private ArticleService articleService;
    @org.junit.Test
    public void doSave() {
        //使用map集合存放数据
        Map<String,String> map=new HashMap<>();
        map.put("target","1000000009");
        map.put("link","admk");
        map.put("date","2020-6-16");
        boolean flag=articleService.doSave(map);
        assertTrue(flag);
    }

}