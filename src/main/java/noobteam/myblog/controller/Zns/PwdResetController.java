package noobteam.myblog.controller.Zns;

import noobteam.myblog.service.Zns.PwdResetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PwdResetController {

    @Resource
    PwdResetService pwdResetService;

    @RequestMapping("/pwdreset")
    public boolean findUsrandEmail(@RequestParam Map<String,String> js){
        boolean flag =false;
        List<Map<String,Object>> list = pwdResetService.findUsrandEmail();
        Map<String,String> updatepwd = new HashMap<>();
        try {
            for(Map<String,Object> map : list){
                if(map.get("name").equals(js.get("name")) && map.get("email").equals(js.get("email"))){
                    updatepwd.put("no", map.get("no").toString());
                    updatepwd.put("pwd", js.get("pwd"));
                    flag = pwdResetService.pwdReset(updatepwd);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
