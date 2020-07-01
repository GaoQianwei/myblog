package noobteam.myblog.controller.Zns;

import noobteam.myblog.service.Zns.AdminService;
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
public class AdminControllerTest {
    @Resource
    AdminService adminService;

    @Test
    public void findusr() {
        List<Map<String,Object>> list = adminService.findusr();
        System.out.println(list);
    }
}