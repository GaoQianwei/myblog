package noobteam.myblog.controller.Zns;

import noobteam.myblog.MathUtils;
import noobteam.myblog.service.Zns.SignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
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
    public Map<String,String> findall(@RequestParam Map<String,String> js){
        boolean flag = false;
        List<Map<String,Object>> list = signService.findall();
        Map<String,String> updatejs = new HashMap<>();
        try {
            for(Map<String,Object> map : list){
                if(map.get("name").equals(js.get("name")) && map.get("code").equals(js.get("pwd"))){
                    updatejs = updateDate(map.get("no").toString());
                    flag = signService.updateUsr_stus(updatejs);
                    if(flag)
                        updatejs.put("flag", "true");
                    else updatejs.put("flag", "false");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updatejs;
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

    @RequestMapping("/setCookies_no")
    public String setCookies(HttpServletResponse response, String no){
        Cookie cookie = new Cookie("usr_no", no);
        response.addCookie(cookie);
        System.out.println("Cookies添加成功");
        return "Cookies添加成功";
    }


    @RequestMapping("/signup")
    public boolean insert(@RequestParam Map<String,String> js){
        String no = MathUtils.makeUpNewData(Thread.currentThread().hashCode()+"", 3)+ MathUtils.randomDigitNumber(7);
        js.put("no",no);
        boolean flag = signService.insert(js);
        return flag;
    }



}
