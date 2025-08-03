import java.util.*;

class Meeting {
    private int meetingId;
    private int createdBy;
    private String title;
    private String time;
    private List<Integer> participantIds;

    public Meeting(int meetingId, int createdBy, String title, String time) {
        this.meetingId = meetingId;
        this.createdBy = createdBy;
        this.title = title;
        this.time = time;
        this.participantIds = new ArrayList<>();
    }

    public void addParticipant(int userId) {
        participantIds.add(userId);
    }
}