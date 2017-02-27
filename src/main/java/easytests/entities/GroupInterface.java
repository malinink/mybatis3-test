package easytests.entities;

import java.util.List;

/**
 * @author malinink
 */
public interface GroupInterface extends IdentityInterface {
    GroupInterface setId(Integer id);

    Integer getNumber();

    GroupInterface setNumber(Integer number);

    StudentInterface getSteward();

    GroupInterface setSteward(StudentInterface steward);

    List<StudentInterface> getStudents();

    GroupInterface setStudents(List<StudentInterface> students);
}
