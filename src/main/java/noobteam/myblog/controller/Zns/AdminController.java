package noobteam.myblog.controller.Zns;

import noobteam.myblog.service.Zns.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("/admin")
    public Map<String,Object> findusr(){
        List<Map<String,Object>> list = adminService.findusr();
        Map rst = new HashMap();
        rst.put("data",list);
        return rst;
    }

}
