package noobteam.myblog.service.Zns;

import noobteam.myblog.mapper.Zns.CheckMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class CheckService {
    @Resource
    CheckMapper checkMapper;

    public List<Map<String,Object>> neGet(){
        List<Map<String,Object>> list = null;
        try {
            list = checkMapper.neGet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
