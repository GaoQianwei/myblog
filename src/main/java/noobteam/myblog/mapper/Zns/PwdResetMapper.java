package noobteam.myblog.mapper.Zns;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface PwdResetMapper {

    @Select("select a.name, a.no, b.email" +
            " from user a inner join per_infomation b" +
            " on a.no = b.target")
    public List<Map<String,Object>> findUsrandEmail ();

    @Update("update sign_in set code=(#{js.pwd}) where no = (#{js.no})")
    public boolean pwdReset(@Param("js") Map<String,String> map);

}


