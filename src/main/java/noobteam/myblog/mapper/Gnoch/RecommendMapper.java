package noobteam.myblog.mapper.Gnoch;


import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface RecommendMapper {

    @Select("select a.sex,a.email,a.description,a.target,b.name"+
            " from per_infomation a inner join user b"+
            " on a.target=b.no")
    public List<Map<String,Object>> GetRec();

    @Insert("insert into friendship(user_no,friend_no)"+
            "value(#{f.user_no},#{f.friend_no})")
    public int Addfrd(@Param("f") Map<String,String> map);

    @Select("select friend_no from friendship where user_no=#{u.user_no}")
    public List<Map<String,String>> CheckRep(@Param("u") Map<String,String>map);
}
