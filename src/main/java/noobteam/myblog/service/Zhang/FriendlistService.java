package noobteam.myblog.service.Zhang;
import noobteam.myblog.mapper.Zhang.FriendlistMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FriendlistService {

    @Resource
    private FriendlistMapper friendlistMapper;

    public List<Map<String,Object>> Name(Map<String,String>map){
        List<Map<String,Object>> list=null;
        try {
            String tar=map.get("user_no");
            list=friendlistMapper.name(tar);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean doDelete(Map<String, String> map) {
        boolean flag = false;
        try {
            int id = Integer.parseInt(map.get("id"));
            int r = friendlistMapper.delete(id);
            if (r > 0) {
                flag = true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }
}