package com.bwgjoseph.springbootmongock.event;

import java.time.Instant;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import io.mongock.runner.spring.base.events.SpringMigrationFailureEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MongockFailEventListener implements ApplicationListener<SpringMigrationFailureEvent> {

    @Override
    public void onApplicationEvent(SpringMigrationFailureEvent event) {
        log.info("Mongock failed at {}", Instant.ofEpochMilli(event.getTimestamp()));
    }

}
