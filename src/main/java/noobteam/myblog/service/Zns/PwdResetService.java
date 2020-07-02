package noobteam.myblog.service.Zns;
import noobteam.myblog.mapper.Zns.PwdResetMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;
import java.util.Map;

@Service
public class PwdResetService {

    @Resource
    PwdResetMapper pwdResetMapper;

    public List<Map<String,Object>> findUsrandEmail (){
        List<Map<String,Object>> list = null;
        try {
            list = pwdResetMapper.findUsrandEmail();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean pwdReset(Map<String,String> map){
        boolean flag = false;
        try {
            flag = pwdResetMapper.pwdReset(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
