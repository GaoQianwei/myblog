package noobteam.myblog.mapper.Bao;

import org.apache.ibatis.annotations.*;
import java.util.List;
import java.util.Map;

@Mapper
public interface ArticleMapper {

    @Select("select * from article")
    public List<Map<String,Object>> findAll();

    @Select("select * from article where id=#{n}")
    public Map<String,Object> findById(int id);

    @Insert("insert into article(target,link,date)" +
            "value(#{art.target},#{art.link},#{art.date})")
    public int save(@Param("art") Map<String,String> map);

    @Update("update article " +
            " set target=#{t.target},link=#{t.link},date=#{t.date}" +
            " where id=#{t.id}")
    public int update(@Param("t") Map<String,String> tea);

    @Delete("delete from article where id=#{id}")
    public int delete(int id);

}
