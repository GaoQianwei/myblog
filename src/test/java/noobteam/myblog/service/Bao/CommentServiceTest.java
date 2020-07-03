package noobteam.myblog.service.Bao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommentServiceTest {

    @Resource
    private CommentService commentService;
    @org.junit.Test
    public void doSave() {
        //使用map集合存放数据
        Map<String,String> map=new HashMap<>();
        map.put("date","2020-6-20");
        map.put("text","hhh");
        map.put("usr_target","1000000010");
        map.put("art_target","6");
        boolean flag=commentService.doSave(map);
        assertTrue(flag);
    }

    @org.junit.Test
    public void findByTar() {
        Map<String,String> map=new HashMap<>();
        map.put("art_target","8");
        map.put("link","admk");
        map.put("date","2020-6-16");
        List<Map<String,Object>> list=commentService.findByTar(map);
        System.out.println(list);
    }

}