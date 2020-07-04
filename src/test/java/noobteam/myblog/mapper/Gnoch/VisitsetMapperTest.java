package noobteam.myblog.mapper.Gnoch;

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
public class VisitsetMapperTest {

    @Resource
    private VisitsetMapper visitsetMapper;

    @Test
    public void permissionSet() {
    }

    @Test
    public void getPrmsset() {

    }

    @Test
    public void decSet() {
        Map<String, String> map=new HashMap<>();
        map.put("dectype","type2");
        map.put("target","21e");
        int m=visitsetMapper.DecSet(map);
        System.out.println(m);
    }

    @Test
    public void getDec() {
        Map<String, String> map=new HashMap<>();
        map.put("target","1454224428");
        String m=visitsetMapper.GetDec(map);
        System.out.println(m);
    }
}