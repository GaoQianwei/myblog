package noobteam.myblog.controller.Gao;

import noobteam.myblog.service.Gao.PhotoService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class PhotoController {
    @Resource
    private PhotoService photoService;

    /**
     * 通过RequestMapping设置该方法，请求的路径
     * @return
     */
    @RequestMapping("/allPH")
    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=photoService.findAll();
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
    @RequestMapping("/savePH")
    public String save(@RequestParam Map<String,String> map){
        String msg="上传失败";
        boolean flag=photoService.doSave(map);
        if(flag){
            msg="上传成功";
        }
        return msg;
    }

    /**
     * url 只要符合java命名规范即可
     * @param map
     * @return
     */
    @RequestMapping("/deletePH")
    public String delete(@RequestParam Map<String,String> map){
        String msg="删除失败";
        boolean flag=photoService.doDelete(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/editPH")
    public String update(@RequestParam Map<String,String> map){
        String msg="修改失败";
        boolean flag=photoService.doUpdate(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }
}
