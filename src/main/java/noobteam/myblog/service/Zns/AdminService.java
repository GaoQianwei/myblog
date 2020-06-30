package noobteam.myblog.service.Zns;

import noobteam.myblog.mapper.Zns.AdminMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class AdminService {

    @Resource
    AdminMapper adminMapper;

    public List<Map<String,Object>> findusr(){
        List<Map<String,Object>> list = null;
        try {
            list = adminMapper.findusr();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
