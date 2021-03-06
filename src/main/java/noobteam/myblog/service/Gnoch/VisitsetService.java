package noobteam.myblog.service.Gnoch;

import noobteam.myblog.mapper.Gnoch.VisitsetMapper;
import org.apache.ibatis.jdbc.Null;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class VisitsetService {
    @Resource
    private VisitsetMapper visitsetMapper;

    public boolean doprmsset(Map<String,String> map){
            boolean flag=false;
        try {
            int r=visitsetMapper.PermissionSet(map);
            if (r>0) flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean dodecset(Map<String,String>map){
        boolean flag=false;
        try {
            int r=visitsetMapper.DecSet(map);
            if (r>0) flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    public String getdecset(Map<String,String>map){
        boolean flag=false;
        String r = null;
        try {
            r=visitsetMapper.GetDec(map);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }

}
