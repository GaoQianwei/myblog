package noobteam.myblog.mapper.Bao;

import org.apache.ibatis.annotations.*;
import java.util.List;
import java.util.Map;

@Mapper
public interface CommentMapper {

    @Select("select * from comment")
    public List<Map<String,Object>> findAll();

    @Select("select * from comment where id=#{n}")
    public Map<String,Object> findById(int id);

    @Insert("insert into comment(date,text,usr_target,art_target)" +
            "value(#{com.date},#{com.text},#{com.usr_target},#{com.art_target})")
    public int save(@Param("com") Map<String,String> map);

    @Update("update test " +
            " set target=#{t.target},link=#{t.link},date=#{t.date}" +
            " where id=#{t.id}")
    public int update(@Param("t") Map<String,String> tea);

    @Delete("delete from comment where id=#{id}")
    public int delete(int id);

}
