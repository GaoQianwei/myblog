package noobteam.myblog.mapper.Gao;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface MessageBoardMapper {
    @Select("select * from message")
    public List<Map<String,Object>> findAll();

    @Select("select * from message where id=#{id}")
    public Map<String,Object> findById(int id);

    @Insert("insert into message(text,visit_tar,data,host_tar)" +
            "value(#{tea.name},#{tea.sex},#{tea.no},#{tea.host_tar})")
    public int save(@Param("tea") Map<String,String> map);


    @Update("update message " +
            " set text=#{t.name},data=#{t.no},visit_tar=#{t.sex}" +
            " where id=#{t.id}")
    public int update(@Param("t") Map<String,String> tea);

    /**
     * #{id} 习惯写法
     * @param id
     * @return
     */
    @Delete("delete from message where id=#{id}")
    public int delete(int id);
}

