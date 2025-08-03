import java.util.List;

public class User {
    private String userName;
    private int userId;
    private String position;

    List<Integer> createdMeetingIds;

    User(String name, int id){
        userName = name;
        userId = id;
    }
}
