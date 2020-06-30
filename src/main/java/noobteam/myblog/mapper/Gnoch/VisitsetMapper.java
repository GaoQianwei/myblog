package noobteam.myblog.mapper.Gnoch;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.Map;

@Mapper
public interface VisitsetMapper {
    @Update("update visitset "+" set prmsset=#{u.prmsset} "+" where no=#{u.no}")
    public int PermissionSet(@Param("u") Map<String, String>map);
}
