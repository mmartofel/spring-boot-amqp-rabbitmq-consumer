package com.springbootdev.samples.rabbitmq.consumer.repository;

import com.springbootdev.samples.rabbitmq.consumer.model.ReceivedMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mmartofel on 7/19/18.
 */

@Repository
public interface ReceivedMessageRepository extends CrudRepository<ReceivedMessage, Long> {

}
