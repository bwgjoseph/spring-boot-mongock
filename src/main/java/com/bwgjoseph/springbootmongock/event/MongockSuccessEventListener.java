package com.bwgjoseph.springbootmongock.event;

import java.time.Instant;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import io.mongock.runner.spring.base.events.SpringMigrationSuccessEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MongockSuccessEventListener implements ApplicationListener<SpringMigrationSuccessEvent> {

    @Override
    public void onApplicationEvent(SpringMigrationSuccessEvent event) {
        log.info("Mongock succeeded at {}", Instant.ofEpochMilli(event.getTimestamp()));
    }
}
