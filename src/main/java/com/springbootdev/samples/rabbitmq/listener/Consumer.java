package com.springbootdev.samples.rabbitmq.listener;

import com.springbootdev.samples.rabbitmq.model.Order;
import com.springbootdev.samples.rabbitmq.model.ReceivedMessage;
import com.springbootdev.samples.rabbitmq.repository.ReceivedMessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "${spring.rabbitmq.queue}")
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @Autowired
    ReceivedMessageRepository messagesRepository;

    @RabbitHandler
    public void receiveMessage(Order order)
    {
        // Log the message at application level
        LOGGER.info(" receive message [" + order.toString() + "] ");

        // Persist message at the database
        messagesRepository.save(new ReceivedMessage(null, order.toString()));
        // Check the number of records at the repository table
        LOGGER.info("Number of records at the repository: " + messagesRepository.count());
    }

}
