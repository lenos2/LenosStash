package org.rotaract9210.d9210events.myObjects;

/**
 * Created by Leom on 2017/01/18.
 * This is the template for messages retrieved from the database
 */

public class Message {
    private String eventId;
    private String name;
    private String title;
    private String message;

    public Message(String eventId, String name, String title, String message) {
        this.eventId = eventId;
        this.name = name;
        this.title = title;
        this.message = message;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
