package com.springbootdev.samples.rabbitmq.consumer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by mmartofel on 7/19/18.
 */

@Entity
@Table(name="received_messages")
public class ReceivedMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String message_payload;

    public ReceivedMessage(Long id, String message_payload) {
        this.id = id;
        this.message_payload = message_payload;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage_payload() {
        return message_payload;
    }

    public void setMessage_payload(String message_payload) {
        this.message_payload = message_payload;
    }

    @Override
    public String toString() {
        return "ReceivedMessage{" +
                "id=" + id +
                ", message_payload='" + message_payload + '\'' +
                '}';

    }
}
