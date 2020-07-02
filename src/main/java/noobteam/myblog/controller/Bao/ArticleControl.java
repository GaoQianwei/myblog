package noobteam.myblog.controller.Bao;

import noobteam.myblog.service.Bao.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class ArticleControl {

    @Resource
    private ArticleService articleService;

    @RequestMapping("/art_all")
    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=articleService.findAll();
        return list;
    }

    @RequestMapping("/art_save")

    public String save(@RequestParam Map<String,String> map){
        String msg="发表失败";
        boolean flag=articleService.doSave(map);
        if(flag){
            msg="发表成功";
        }
        return msg;
    }

    @RequestMapping("/art_delete")

    public String delete(@RequestParam Map<String,String> map){
        String msg="删除失败";
        boolean flag=articleService.doDelete(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/art_edit")
    public String update(@RequestParam Map<String,String> map){
        String msg="修改失败";
        boolean flag=articleService.doUpdate(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }

}
