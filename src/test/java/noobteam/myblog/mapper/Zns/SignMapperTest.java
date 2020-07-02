package noobteam.myblog.mapper.Zns;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SignMapperTest {

    @Resource
    private SignMapper signMapper;

    @Test
    public void findall() {
        List<Map<String,Object>> list = signMapper.findall();
        System.out.println(list);
    }
}