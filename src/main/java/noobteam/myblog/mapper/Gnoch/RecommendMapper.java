package noobteam.myblog.mapper.Gnoch;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface RecommendMapper {

    @Select("select sex,email,description from per_infomation")
    public List<Map<String,Object>> GetRec();

}
