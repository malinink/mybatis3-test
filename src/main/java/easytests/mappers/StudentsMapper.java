package easytests.mappers;

import easytests.entities.Group;
import easytests.entities.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.ObjectTypeHandler;
import org.apache.ibatis.type.ArrayTypeHandler;

/**
 * @author malinink
 */
@Mapper
public interface StudentsMapper {

    @Results(
        {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "group.id", column = "group_id", javaType = Group.class, typeHandler = ObjectTypeHandler.class)
            /*
                @Result(
                    property = "group",
                    column = "group_id",
                    javaType = Group.class,
                    //typeHandler = ObjectTypeHandler.class,
                    typeHandler = ArrayTypeHandler.class,
                    one = @One(select = "easytests.mappers.GroupsMapper.find", fetchType = FetchType.LAZY)
            )*/
        })

    @Select("SELECT id, name, group_id FROM students WHERE id = #{id}")
    Student find(Integer id);
}
