package noobteam.myblog.controller.Gao;
import noobteam.myblog.service.Gao.MessageBoardService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class MessageBoardController {
    @Resource
    private MessageBoardService messageBoardService;

    /**
     * 通过RequestMapping设置该方法，请求的路径
     * @return
     */
    @RequestMapping("/allMB")
    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=messageBoardService.findAll();
        return list;
    }
    /**
     *
     * RequestParam 就是通知服务器，前端提交的数据封装成Map集合
     *      以表单控件的name属性的值作为 map集合的key
     *      以表单控件的value属性的值作为map集合的value
     * @param map
     * @return
     */
    @RequestMapping("/saveMB")
    public String save(@RequestParam Map<String,String> map){
        String msg="留言失败";
        boolean flag=messageBoardService.doSave(map);
        if(flag){
            msg="留言成功";
        }
        return msg;
    }

    /**
     * url 只要符合java命名规范即可
     * @param map
     * @return
     */
    @RequestMapping("/deleteMB")
    public String delete(@RequestParam Map<String,String> map){
        String msg="删除失败";
        boolean flag=messageBoardService.doDelete(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/editMB")
    public String update(@RequestParam Map<String,String> map){
        String msg="修改失败";
        boolean flag=messageBoardService.doUpdate(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }
}
