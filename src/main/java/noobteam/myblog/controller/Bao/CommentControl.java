package noobteam.myblog.controller.Bao;

import noobteam.myblog.service.Bao.CommentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class CommentControl {

    @Resource
    private CommentService commentService;

    @RequestMapping("/com_all")
    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=commentService.findAll();
        return list;
    }

    @RequestMapping("/com_art")

    public List<Map<String,Object>> findByTar(@RequestParam Map<String,String> map){
        List<Map<String,Object>> list=commentService.findByTar(map);
        return list;
    }

    @RequestMapping("/com_art_usr")

    public List<Map<String,Object>> findByTarGet(@RequestParam Map<String,String> map){
        List<Map<String,Object>> list=commentService.findByTarGet(map);
        return list;
    }

    @RequestMapping("/com_save")

    public String save(@RequestParam Map<String,String> map){
        String msg="发表失败";
        boolean flag=commentService.doSave(map);
        if(flag){
            msg="发表成功";
        }
        return msg;
    }

    @RequestMapping("/com_delete")

    public String delete(@RequestParam Map<String,String> map){
        String msg="删除失败";
        boolean flag=commentService.doDelete(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/com_edit")
    public String update(@RequestParam Map<String,String> map){
        String msg="修改失败";
        boolean flag=commentService.doUpdate(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }
}
