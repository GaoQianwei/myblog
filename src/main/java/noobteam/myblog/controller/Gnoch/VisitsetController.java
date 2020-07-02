package noobteam.myblog.controller.Gnoch;

import noobteam.myblog.service.Gnoch.VisitsetService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class VisitsetController {

    @Resource
    private VisitsetService visitsetService;

    /**
     * url 只要符合java命名规范即可
     * @param map
     * @return
     */
    @RequestMapping("/prmssetctlr")
    public String prmsset(@RequestParam Map<String,String> map){
        String msg="修改失败";
        boolean r=visitsetService.doprmsset(map);
        if(r) msg="修改成功";
        return msg;
    }

    @RequestMapping("/dectlr")
    public String decset(@RequestParam Map<String,String> map){
        String msg="修改失败";
        boolean r=visitsetService.dodecset(map);
        if(r) msg="修改成功";
        return msg;
    }
    @RequestMapping("/getdectlr")
    public String getdec(@RequestParam Map<String,String> map){
        String r=visitsetService.getdecset(map);
        return r;
    }
}
