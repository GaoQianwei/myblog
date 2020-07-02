package noobteam.myblog.mapper.Gnoch;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface RecommendMapper {

    @Select("select id,dectype,prmsset from visitset")
    public List<Map<String,Object>> GetRec();

}
