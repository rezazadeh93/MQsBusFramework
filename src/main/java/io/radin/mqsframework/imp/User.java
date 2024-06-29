package io.radin.mqsframework.imp;

import java.util.UUID;

public class User {
    private final UUID id = UUID.randomUUID();
    private final Long createdAt = System.currentTimeMillis();
//    private List<Topic> topics;
}
