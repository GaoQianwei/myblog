package noobteam.myblog.service.Gao;

import noobteam.myblog.mapper.Gao.PhotoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.List;
@Service
public class PhotoService {
    @Resource
    private PhotoMapper photoMapper;

    public boolean doSave(Map<String, String> map) {
        boolean flag = false;
        //选择要添加监控的代码
        //ctrl+alt+t 打开 surround with窗口 选择 try catch
        try {
            int r = photoMapper.save(map);
            if (r > 0) {
                flag = true;
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
            int r=photoMapper.delete(id);
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
            double r=photoMapper.update(map);
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
            list=photoMapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map<String,Object> findById(Map<String,String> map){
        Map<String,Object> tea=null;
        try {
            int id=Integer.parseInt(map.get("id"));
            tea=photoMapper.findById(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return tea;
    }

}
