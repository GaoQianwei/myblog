package noobteam.myblog.mapper.Gnoch;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Map;

@Mapper
public interface VisitsetMapper {
    @Update("update per_infomation "+" set prmsset=#{u.prmsset} "+" where target=#{u.target}")
    public int PermissionSet(@Param("u") Map<String, String>map);

    @Select("select prmsset from per_infomation where target=#{u.target}")
    public String GetPrmsset(@Param("u") Map<String ,String>map);

    @Update("update per_infomation "+" set dectype=#{u.dectype} "+" where target=#{u.target}")
    public int DecSet(@Param("u") Map<String ,String>map);

    @Select("select dectype from per_infomation where target=#{u.target}")
    public String GetDec(@Param("u") Map<String ,String>map);


}
