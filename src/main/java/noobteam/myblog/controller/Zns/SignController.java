package noobteam.myblog.controller.Zns;

import noobteam.myblog.MathUtils;
import noobteam.myblog.service.Zns.SignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class SignController {
    @Resource
    private SignService signService;

    @RequestMapping("/signin")
    /**
    public List<Map<String,Object>> findall(){
        List<Map<String,Object>> list = signService.findall();
        return list;
    }
    **/
    public boolean findall(@RequestParam Map<String,String> js){
        boolean flag = false;
        List<Map<String,Object>> list = signService.findall();
        try {
            for(Map<String,Object> map : list){
                if(map.get("name").equals(js.get("name")) && map.get("code").equals(js.get("pwd"))){
                    Map<String,String> updatejs = updateDate(map.get("no").toString());
                    flag = signService.updateUsr_stus(updatejs);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public Map<String,String> updateDate(String no){
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd");
        Date date = new Date();
        Map<String,String> map = new HashMap<>();
        map.put("date", sdf.format(date));
        map.put("no",no);
        return map;
    }

    @RequestMapping("/signup")
    public boolean insert(@RequestParam Map<String,String> js){
        String no = MathUtils.makeUpNewData(Thread.currentThread().hashCode()+"", 3)+ MathUtils.randomDigitNumber(7);
        js.put("no",no);
        boolean flag = signService.insert(js);
        return flag;
    }
}
