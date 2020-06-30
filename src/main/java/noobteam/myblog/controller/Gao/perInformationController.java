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

    @RequestMapping("/editPersonalInformation")
    public String update(@RequestParam Map<String,String> map){
        String msg="修改失败";
        boolean flag=perInformationService.doUpdate(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }
}
