package noobteam.myblog.service.Gao;
import noobteam.myblog.mapper.Gao.MessageBoardMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.List;
@Service
public class MessageBoardService {

    @Resource
    private MessageBoardMapper messageBoardMapper;

    public boolean doSave(Map<String, String> map) {
        boolean flag = false;
        //选择要添加监控的代码
        //ctrl+alt+t 打开 surround with窗口 选择 try catch
        try {
            int r = messageBoardMapper.save(map);
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
            int r=messageBoardMapper.delete(id);
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
            double r=messageBoardMapper.update(map);
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
            list=messageBoardMapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map<String,Object> findById(Map<String,String> map){
        Map<String,Object> tea=null;
        try {
            int id=Integer.parseInt(map.get("id"));
            tea=messageBoardMapper.findById(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return tea;
    }
}
