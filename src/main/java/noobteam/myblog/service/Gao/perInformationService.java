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

    public boolean doUpdate(Map<String,String> tea){
        boolean flag=false;
        try {
            double r=perInfomationMapper.update(tea);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=null;
        try {
            list=perInfomationMapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


}
