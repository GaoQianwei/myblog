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
public class CommentMapperTest {


    @Resource
    private CommentMapper commentMapper;
    @org.junit.Test
    public void findAll() {
        List<Map<String,Object>> list = commentMapper.findAll();
        System.out.println(list);
    }

    @org.junit.Test
    public void findById() {
        Map<String,Object> map=commentMapper.findById(2);
        System.out.println(map);
    }

    @Test
    public void findByTar() {
        String a="8";
        List<Map<String,Object>> map=commentMapper.findByTar(a);
        System.out.println(map);
    }

    @org.junit.Test
    public void save() {
        //使用map集合存放数据
        Map<String,String> map=new HashMap<>();
        map.put("date","2020-6-30");
        map.put("text","啦啦啦");
        map.put("usr_target","1000000009");
        map.put("art_target","9");
        int n=commentMapper.save(map);
        //junit中的断言，进行提示显示，如果执行的结果跟我们的期望职相同，测试通过
        assertEquals(1,n);
    }

    @org.junit.Test
    public void update() {
        Map<String,String> map=new HashMap<>();
        map.put("date","2020-6-16");
        map.put("text","啦啦啦aaa");
        map.put("usr_target","1000000001");
        map.put("art_target","8");
        map.put("id","1");
        int n=commentMapper.update(map);
        assertEquals(1,n);
    }

    @org.junit.Test
    public void delete() {
        int n=commentMapper.delete(1);
        assertEquals(1,n);
    }
}