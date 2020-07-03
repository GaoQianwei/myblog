package noobteam.myblog.service.Bao;

import noobteam.myblog.mapper.Bao.CommentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.List;

//我们spring框架就知道，在BeanFactory中要管理该类
@Service
public class CommentService {

    @Resource
    private CommentMapper commentMapper;

    public boolean doSave(Map<String,String> map){
        boolean flag=false;
        //选择要添加监控的代码
        //ctrl+alt+t 打开 surround with窗口 选择 try catch
        try {
            int r=commentMapper.save(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            //记录日志，写到文件中进行保存
        }
        return flag;
    }

    public boolean doDelete(Map<String,String> map){
        boolean flag=false;
        try {
            int id=Integer.parseInt(map.get("id"));
            int r=commentMapper.delete(id);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean doUpdate(Map<String,String> map){
        boolean flag=false;
        try {
            int r=commentMapper.update(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=null;
        try {
            list=commentMapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map<String,Object> findById(Map<String,String> map){
        Map<String,Object> com=null;
        try {
            int id=Integer.parseInt(map.get("id"));
            com=commentMapper.findById(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return com;
    }

    public List<Map<String,Object>> findByTar(Map<String,String> map){
        List<Map<String,Object>> list=null;
        try {
            String tar=map.get("art_target");
            list=commentMapper.findByTar(tar);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> findByTarGet(Map<String,String> map){
        List<Map<String,Object>> list=null;
        try {
            String tar=map.get("art_target");
            list=commentMapper.findByTarGet(tar);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return list;
    }
}

