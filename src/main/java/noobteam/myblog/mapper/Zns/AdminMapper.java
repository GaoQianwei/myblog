package noobteam.myblog.mapper.Zns;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminMapper {

    @Select("select a.name , b.stus, b.date" +
            " from user a inner join user_stus b" +
            " on a.no = b.target")
    public List<Map<String,Object>> findusr();
}
