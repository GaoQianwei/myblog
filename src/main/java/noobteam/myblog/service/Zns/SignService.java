package noobteam.myblog.service.Zns;

import noobteam.myblog.mapper.Zns.SignMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SignService {

    @Resource
    SignMapper signMapper;

    public List<Map<String,Object>> findall(){
        List<Map<String,Object>> list = null;
        try {
            list = signMapper.findall();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insert(Map<String,String> js){
        boolean flag = false;
        try {
            boolean f1 = signMapper.insertemail(js);
            boolean f2 = signMapper.insertpwd(js);
            boolean f3 = signMapper.insertname(js);
            flag = f1 && f2;
            flag = flag && f3;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

}
