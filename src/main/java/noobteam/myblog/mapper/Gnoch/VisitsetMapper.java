package noobteam.myblog.mapper.Gnoch;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Map;

@Mapper
public interface VisitsetMapper {
    @Update("update visitset "+" set prmsset=#{u.prmsset} "+" where no=#{u.no}")
    public int PermissionSet(@Param("u") Map<String, String>map);

    @Select("select prmsset from visitset where no=#{u.no}")
    public String GetPrmsset(@Param("u") Map<String ,String>map);

    @Update("update visitset "+" set dectype=#{u.dectype} "+" where no=#{u.no}")
    public int DecSet(@Param("u") Map<String ,String>map);

    @Select("select dectype from visitset where no=#{u.no}")
    public String GetDec(@Param("u") Map<String ,String>map);


}
