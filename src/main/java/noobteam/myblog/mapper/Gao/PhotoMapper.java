package noobteam.myblog.mapper.Gao;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface PhotoMapper {

    @Select("select * from photo")
    public List<Map<String,Object>> findAll();

    @Insert("insert into photo(id,collection,store,note)" +
            "value(#{mes.id},#{mes.collection},#{mes.store},#{mes.note})")
    public int save(@Param("mes") Map<String, String> map);

    @Update("update photo " +
            " set collection=#{t.collection},store=#{t.store},note=#{t.note}" +
            " where id=#{t.id}")
    public int update(@Param("t") Map<String,String> tea);

    @Delete("delete from photo where id=#{id}")
    public int delete(int id);

    @Select("select * from photo where id=#{id}")
    public Map<String,Object> findById(int id);
}
