package noobteam.myblog.service.Gao;

import noobteam.myblog.mapper.Gao.perInfomationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.List;

@Service
public class perInformationService {

    @Resource
    private perInfomationMapper perInfomationMapper;

    public boolean doUpdate(Map<String,String> map){
        boolean flag=false;
        try {
            double r=perInfomationMapper.update(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }


}
