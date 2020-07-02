package noobteam.myblog.controller.Gao;

import noobteam.myblog.service.Gao.perInformationService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@RestController
public class perInformationController {

    @Resource
    private perInformationService perInformationService;

    @RequestMapping("/editPI")
    public String update(@RequestParam Map<String,String> tea){
        String msg="修改失败";
        boolean flag=perInformationService.doUpdate(tea);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }

    @RequestMapping("/allPI")
    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=perInformationService.findAll();
        return list;
    }
}
