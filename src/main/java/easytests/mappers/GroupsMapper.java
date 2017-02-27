package easytests.mappers;

import easytests.entities.Group;
import easytests.entities.GroupInterface;
import easytests.entities.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import java.util.List;

/**
 * @author malinink
 */
@Mapper
public interface GroupsMapper {

    @Results(
        {
            @Result(property = "id", column = "id"),
            @Result(property = "number", column = "number"),
            //@Result(property = "steward.id", column = "steward_id"),
        })
    @Select("SELECT  id, number, steward_id FROM groups WHERE id = #{id}")
    Group find(Integer id);
}
