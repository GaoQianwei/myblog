package noobteam.myblog.controller.Gnoch;

import noobteam.myblog.service.Gnoch.RecommendService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class RecommendController {

    @Resource
    private RecommendService recommendService;

    @RequestMapping("/getrec")
    public List<Map<String,Object>> getrec(){
        List<Map<String,Object>> list = recommendService.dogetRec();

        return list;
    }
    @RequestMapping("/addfrd")
    public String addfrd(@RequestParam Map<String,String>map){
        String msg="添加失败";
        int rst2=recommendService.Check(map);
        if(rst2>0) {
            int rst=recommendService.doaddfriend(map);
            msg="添加成功";
        }
        else {
            msg="已是好友，请勿重复添加";
        }
        return msg;

    }

}
