package easytests.entities;


/**
 * @author malinink
 */
public class Student implements StudentInterface {

    private Integer id;

    private String name;

    private GroupInterface group;

    public Integer getId() {
        return this.id;
    }

    public StudentInterface setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentInterface setName(String name) {
        this.name = name;
        return this;
    }

    public GroupInterface getGroup() {
        return group;
    }

    public StudentInterface setGroup(GroupInterface group) {
        this.group = group;
        return this;
    }
    
}
