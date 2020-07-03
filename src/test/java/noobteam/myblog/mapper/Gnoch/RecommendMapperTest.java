package noobteam.myblog.mapper.Gnoch;

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
public class RecommendMapperTest {

    @Resource
    private RecommendMapper recommendMapper;
    @Test
    public void getRec() {
    }

    @Test
    public void addfrd() {
    }

    @Test
    public void checkRep() {
        Map<String,String> map=new HashMap<>();
        map.put("user_no","21e");
        List<Map<String,String>> r=recommendMapper.CheckRep(map);
        System.out.println(r);

    }
}