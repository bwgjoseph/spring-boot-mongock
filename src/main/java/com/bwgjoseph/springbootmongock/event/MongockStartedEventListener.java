package com.bwgjoseph.springbootmongock.event;

import java.time.Instant;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import io.mongock.runner.spring.base.events.SpringMigrationStartedEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MongockStartedEventListener implements ApplicationListener<SpringMigrationStartedEvent> {

    @Override
    public void onApplicationEvent(SpringMigrationStartedEvent event) {
        log.info("Mongock started at {}", Instant.ofEpochMilli(event.getTimestamp()));
    }

}
