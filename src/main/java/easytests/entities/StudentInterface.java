package easytests.entities;

/**
 * @author malinink
 */
public interface StudentInterface extends IdentityInterface {
    Integer getId();

    StudentInterface setId(Integer id);

    String getName();

    StudentInterface setName(String name);

    GroupInterface getGroup();

    StudentInterface setGroup(GroupInterface group);
}
