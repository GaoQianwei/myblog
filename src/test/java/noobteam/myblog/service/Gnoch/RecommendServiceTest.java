package noobteam.myblog.service.Gnoch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RecommendServiceTest {

    @Resource
    private RecommendService recommendService;
    @Test
    public void dogetRec() {
    }

    @Test
    public void doaddfriend() {
    }

    @Test
    public void check() {
        Map<String ,String>map=new HashMap<>();
        map.put("user_no","21e");
        map.put("friend_no","21e");
        int r=recommendService.Check(map);
        System.out.println(r);
    }
}