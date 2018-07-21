package com.springbootdev.samples.rabbitmq.service;

import com.springbootdev.samples.rabbitmq.repository.ReceivedMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mmartofel on 7/19/18.
 */

@Service
public class ReceivedMessageService {

    @Autowired
    private ReceivedMessageRepository repository;

}
