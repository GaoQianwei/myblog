package noobteam.myblog.service.Gnoch;


import noobteam.myblog.mapper.Gnoch.RecommendMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RecommendService {

    @Resource
    private RecommendMapper recommendMapper;

    public List<Map<String,Object>> dogetRec(){
        List<Map<String,Object>> list= null;
        try {
            list = recommendMapper.GetRec();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public int doaddfriend(Map<String,String>map){
        int r= 0;
        try {
            r = recommendMapper.Addfrd(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;

    }

}
