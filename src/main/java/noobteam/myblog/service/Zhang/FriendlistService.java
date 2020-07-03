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
    public String Name(Map<String,String>map){
        String n=map.get("friend_name");
        Map<String,String> f= new HashMap<>() ;
        f.put("fr_no",map.get("fr_no"));
        n= String.valueOf(FriendlistMapper.name(f));
        return n;
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