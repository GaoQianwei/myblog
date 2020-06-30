package noobteam.myblog.mapper.Gao;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface perInfomationMapper {

    @Select("select * from per_infomation")
    public List<Map<String,Object>> findAll();

    @Insert("insert into per_infomation(id,signature,sex,birth,email,description,mood)" +
            "value(#{mes.id},#{mes.signature},#{mes.sex},#{mes.birth},#{mes.email},#{mes.description},#{mes.mood})")
    public int save(@Param("mes") Map<String, String> map);

    @Update("update per_infomation " +
            " set signature=#{t.signature},sex=#{t.sex},birth=#{t.birth},email=#{t.email},description=#{t.description},mood=#{t.mood}" +
            " where id=#{t.id}")
    public int update(@Param("t") Map<String,String> tea);
}
