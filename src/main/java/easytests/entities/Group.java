package easytests.entities;

import java.util.List;

/**
 * @author malinink
 */
public class Group implements GroupInterface {

    private Integer id;

    private Integer number;

    private StudentInterface steward;

    private List<StudentInterface> students;

    public Integer getId() {
        return this.id;
    }

    @Override
    public GroupInterface setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public Integer getNumber() {
        return this.number;
    }

    @Override
    public GroupInterface setNumber(Integer number) {
        this.number = number;
        return this;
    }

    @Override
    public StudentInterface getSteward() {
        return this.steward;
    }

    @Override
    public GroupInterface setSteward(StudentInterface steward) {
        this.steward = steward;
        return this;
    }

    @Override
    public List<StudentInterface> getStudents() {
        return this.students;
    }

    @Override
    public GroupInterface setStudents(List<StudentInterface> students) {
        this.students = students;
        return this;
    }
}
