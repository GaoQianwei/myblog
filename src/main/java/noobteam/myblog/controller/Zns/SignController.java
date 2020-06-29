package noobteam.myblog.controller.Zns;

import noobteam.myblog.service.Zns.SignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class SignController {
    @Resource
    private SignService signService;

    @RequestMapping("/signin")
    /**
    public List<Map<String,Object>> findall(){
        List<Map<String,Object>> list = signService.findall();
        return list;
    }
    **/
    public List<Map<String,Object>> findall(){
        List<Map<String,Object>> list = signService.findall();
        return list;
    }

    @RequestMapping("/signup")
    public boolean insert(@RequestParam Map<String,String> js){
        boolean flag = signService.insert(js);
        return flag;
    }
}
