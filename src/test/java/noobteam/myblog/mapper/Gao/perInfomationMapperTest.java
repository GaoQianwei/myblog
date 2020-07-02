package noobteam.myblog.mapper.Gao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class perInfomationMapperTest {

    @Resource
    private  perInfomationMapper perinfomationMapper;
    @Test
    public void findAll() {
        List<Map<String,Object>> list=perinfomationMapper.findAll();
        System.out.println(list);
    }

    @Test
    public void save() {
        Map<String,String>map=new HashMap<>();
        map.put("id","2");
        map.put("signature","回来了");
        map.put("sex","女");
        map.put("birth","1001");
        map.put("email","298979@qq.com");
        map.put("description","没啥想说的");
        map.put("mood","hhh");
        int n=perinfomationMapper.save(map);
        System.out.println(n);
    }

    @Test
    public void update() {

        Map<String,String> tea=new HashMap<>();
        tea.put("id","2");
        tea.put("signature","回来了");
        tea.put("sex","女");
        tea.put("birth","1001");
        tea.put("email","298979@qq.com");
        tea.put("description","没啥想说的");
        tea.put("mood","hhh");
        int n=perinfomationMapper.update(tea);
        assertEquals(1,n);
    }
}