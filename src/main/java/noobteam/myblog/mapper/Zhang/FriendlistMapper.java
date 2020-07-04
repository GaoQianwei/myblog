package noobteam.myblog.mapper.Zhang;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface FriendlistMapper {
    @Select("select id from friend where fr_no='fr3'")
    public char getFrName(Map<String, String> map);

    @Delete("delete from friend where id=#{id}")
    public int delete(int id);

    @Select("select a.name"+
            " from user a inner join friendship b"+
            " on b.friend_no=a.no" +
            " where b.user_no=#{n}")
    public List<Map<String, Object>> name(String no);
}