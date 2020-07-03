package noobteam.myblog.mapper.Zhang;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface FriendlistMapper {
    @Select("select id from friend")
    public List<Map<String,Object>> findAll();
    @Delete("delete from friend where id=#{id}")
    public int delete(int id);
}

