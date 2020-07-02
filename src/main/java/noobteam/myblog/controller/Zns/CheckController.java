package noobteam.myblog.controller.Zns;

import noobteam.myblog.service.Zns.CheckService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class CheckController {
    @Resource
    private CheckService checkService;

    @RequestMapping("/sign_neCheck")
    public String neCheck(@RequestParam Map<String,String> js){
        List<Map<String,Object>> list = checkService.neGet();
        String msg = "ok";
        for(Map<String,Object> map : list){
            if(map.get("name").equals(js.get("name"))){
                return "该用户名已存在，请更改";
            }else if(map.get("email").equals(js.get("email"))){
                return "一个邮箱只能绑定一个用户";
            }
        }
        return msg;
    }
}
