package noobteam.myblog.controller.Zhang;
import noobteam.myblog.service.Zhang.FriendlistService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;
import java.util.Map;

@RestController
public class FriendlistController {
    @Resource
    private FriendlistService friendlistService;


    /**
     * url 只要符合java命名规范即可
     * @param map
     */
    @RequestMapping("/getname")
    public void getname(@RequestParam Map<String,String> map){

        String rst=friendlistService.Name(map);

        System.out.println(rst);
    }
    @RequestMapping("/deletefr")
    public String delete(@RequestParam Map<String,String> map){
        String msg="删除失败";
        boolean flag=friendlistService.doDelete(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }


}