package noobteam.myblog.mapper.Bao;


import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.lang.reflect.MalformedParameterizedTypeException;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ArticleMapperTest {


    @Resource
    private ArticleMapper articleMapper;
    @Test
    public void findAll() {
        List<Map<String,Object>> list = articleMapper.findAll();
        System.out.println(list);
    }

    @Test
    public void findById() {
        Map<String,Object> map=articleMapper.findById(2);
        System.out.println(map);
    }

    @Test
    public void save() {
        //使用map集合存放数据
        Map<String,String> map=new HashMap<>();
        map.put("target","1000000000");
        map.put("link","hjhfk");
        map.put("date","2020-6-30");
        int n=articleMapper.save(map);
        //junit中的断言，进行提示显示，如果执行的结果跟我们的期望职相同，测试通过
        assertEquals(1,n);
    }

    @Test
    public void update() {
        Map<String,String> map=new HashMap<>();
        map.put("target","1000000001");
        map.put("link","askjaslkj");
        map.put("date","2020-6-20");
        map.put("id","1");
        int n=articleMapper.update(map);
        assertEquals(1,n);
    }

    @Test
    public void delete() {
        int n=articleMapper.delete(1);
        assertEquals(1,n);
    }
}