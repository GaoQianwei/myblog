package noobteam.myblog.service.Zhang;
import noobteam.myblog.mapper.Zhang.FriendlistMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.List;
@Service
public class FriendlistService {

    @Resource
    private FriendlistMapper friendlistMapper;

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