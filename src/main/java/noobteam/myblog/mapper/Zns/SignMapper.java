package noobteam.myblog.mapper.Zns;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface SignMapper {

    @Select("select a.name , b.code" +
            " from user a inner join sign_in b" +
            " on a.no = b.no")
    public List<Map<String,Object>> findall();

    @Insert("insert into user (name) values (#{js.name})")
    public boolean insertname(@Param("js") Map<String,String> map);

    @Insert("insert into sign_in (code) values (#{js.pwd})")
    public boolean insertpwd(@Param("js") Map<String,String> map);

    @Insert("insert into per_infomation (email) values (#{js.email})")
    public boolean insertemail(@Param("js") Map<String,String> map);
}


