package noobteam.myblog.mapper.Zns;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface SignMapper {

    @Select("select a.name , b.code , b.no"+
            " from user a inner join sign_in b" +
            " on a.no = b.no")
    public List<Map<String,Object>> findall();

    @Update("update user_stus set date=(#{js.date}), stus=1 where target=(#{js.no})")
    public boolean updateUsr_stus(@Param("js") Map<String,String> map);

    @Insert("insert into user_stus (target) values (#{js.no})")
    public boolean insertNotoUsr_stus(@Param("js") Map<String,String> map);

    @Insert("insert into user (name, no) values (#{js.name}, #{js.no})")
    public boolean insertname(@Param("js") Map<String,String> map);

    @Insert("insert into sign_in (code, no) values (#{js.pwd}, #{js.no})")
    public boolean insertpwd(@Param("js") Map<String,String> map);

    @Insert("insert into per_infomation (email, target) values (#{js.email}, #{js.no})")
    public boolean insertemail(@Param("js") Map<String,String> map);



}


