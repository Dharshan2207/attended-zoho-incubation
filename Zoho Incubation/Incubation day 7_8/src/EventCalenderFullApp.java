// EventCalendarSystem.java

package eventapp;
import java.util.*;
import eventapp.User;

// User class
class User {
    protected int userId;
    protected String name;
    protected String email;

    public User(int id, String name, String email) {
        this.userId = id;
        this.name = name;
        this.email = email;
    }
}

// Event class
class Event {
    private int eventId;
    private String title;
    private String description;
    private String startTime;
    private String endTime;
    private String eventType; // Meeting, Reminder, Birthday
    private boolean isRecurring;
    private List<Integer> participantIds;

    public Event(int id, String title, String desc, String start, String end, String type, boolean recurring) {
        this.eventId = id;
        this.title = title;
        this.description = desc;
        this.startTime = start;
        this.endTime = end;
        this.eventType = type;
        this.isRecurring = recurring;
        this.participantIds = new ArrayList<>();
    }

    public int getEventId() {
        return eventId;
    }

    public String getTitle() {
        return title;
    }

    public void addParticipant(int userId) {
        participantIds.add(userId);
    }

    public List<Integer> getParticipants() {
        return participantIds;
    }

    public void displayDetails() {
        System.out.println("[Event] " + title + " | Type: " + eventType + " | From: " + startTime + " To: " + endTime);
    }
}

// Reminder class
class Reminder {
    private int eventId;
    private String reminderTime;

    public Reminder(int eventId, String time) {
        this.eventId = eventId;
        this.reminderTime = time;
    }

    public void showReminder() {
        System.out.println("[Reminder] for Event ID " + eventId + " at " + reminderTime);
    }
}

// Invitation class
class Invitation {
    private int eventId;
    private int userId;
    private String status; // Pending, Accepted, Rejected

    public Invitation(int eventId, int userId) {
        this.eventId = eventId;
        this.userId = userId;
        this.status = "Pending";
    }

    public int getUserId() {
        return userId;
    }

    public int getEventId() {
        return eventId;
    }

    public String getStatus() {
        return status;
    }

    public void respond(String response) {
        this.status = response;
    }
}

// CalendarSystem class
class CalendarSystem {
    private List<User> users = new ArrayList<>();
    private List<Event> events = new ArrayList<>();
    private List<Reminder> reminders = new ArrayList<>();
    private List<Invitation> invitations = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }

    public void sendInvitation(int eventId, int userId) {
        invitations.add(new Invitation(eventId, userId));
    }

    public void showUserInvitations(int userId) {
        System.out.println("Invitations for User ID: " + userId);
        for (Invitation inv : invitations) {
            if (inv.getUserId() == userId) {
                System.out.println("Event ID: " + inv.getEventId() + " | Status: " + inv.getStatus());
            }
        }
    }

    public void respondToInvitation(int eventId, int userId, String response) {
        for (Invitation inv : invitations) {
            if (inv.getEventId() == eventId && inv.getUserId() == userId) {
                inv.respond(response);
                System.out.println("Response updated.");
                return;
            }
        }
        System.out.println("Invitation not found.");
    }

    public void listEvents() {
        for (Event e : events) {
            e.displayDetails();
        }
    }

    public void listReminders() {
        for (Reminder r : reminders) {
            r.showReminder();
        }
    }
}

// Main class to demo
public class EventCalenderFullApp {
    public static void main(String[] args) {
        CalendarSystem system = new CalendarSystem();

        // Create users
        User u1 = new User(1, "Alice", "alice@mail.com");
        User u2 = new User(2, "Bob", "bob@mail.com");
        system.addUser(u1);
        system.addUser(u2);

        // Create an event
        Event event = new Event(101, "Team Meeting", "Monthly sync-up", "10:00 AM", "11:00 AM", "Meeting", false);
        event.addParticipant(u1.userId);
        event.addParticipant(u2.userId);
        system.addEvent(event);

        // Add reminder
        Reminder rem = new Reminder(101, "9:45 AM");
        system.addReminder(rem);

        // Send invitations
        system.sendInvitation(101, u1.userId);
        system.sendInvitation(101, u2.userId);

        // View all events
        system.listEvents();

        // View reminders
        system.listReminders();

        // View invitations
        system.showUserInvitations(1);

        // Respond to invitation
        system.respondToInvitation(101, 1, "Accepted");
        system.showUserInvitations(1);
    }
}
