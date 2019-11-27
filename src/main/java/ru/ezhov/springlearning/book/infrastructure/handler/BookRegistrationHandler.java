package ru.ezhov.springlearning.book.infrastructure.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class BookRegistrationHandler {

    private static final Logger LOG = LoggerFactory.getLogger(BookRegistrationHandler.class);

    @JmsListener(destination = "public.book.register")
    public void message(TextMessage textMessage) throws JMSException {
        LOG.debug("method=message action=\"получено сообщение '{}' в очереди '{}'\"", textMessage.getText(), "public.book.register");
    }
}
