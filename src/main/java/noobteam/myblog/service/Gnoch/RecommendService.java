package noobteam.myblog.service.Gnoch;


import noobteam.myblog.mapper.Gnoch.RecommendMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
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
    public int Check(Map<String,String>map){
        int r=1;
        List<Map<String,String>> s=null;
        String t=map.get("friend_no");
        Map<String,String> u= new HashMap<>() ;
        u.put("user_no",map.get("user_no"));
        s=recommendMapper.CheckRep(u);
        int v=s.size();
        for (int i=0;i<v;i++){
            String w = s.get(i).get("friend_no");
            if (w.equals(t)){r=0;}
        }

        return r;

    }

}
