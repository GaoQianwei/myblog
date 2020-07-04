package noobteam.myblog.mapper.Zhang;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import noobteam.myblog.mapper.Bao.CommentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.lang.reflect.MalformedParameterizedTypeException;
import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class FriendlistMapperTest {

    @Resource
    private FriendlistMapper friMapper;

    @org.junit.Test
    public void name() {
            String a="1454224428";
            List<Map<String,Object>> map=friMapper.name(a);
            System.out.println(map);
        }
}