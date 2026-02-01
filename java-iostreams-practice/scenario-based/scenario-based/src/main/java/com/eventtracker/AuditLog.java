package com.eventtracker;

import java.time.LocalDateTime;

public class AuditLog {

    private String event;
    private String severity;
    private String method;
    private String timestamp;

    public AuditLog(String event, String severity, String method) {
        this.event = event;
        this.severity = severity;
        this.method = method;
        this.timestamp = LocalDateTime.now().toString();
    }

    // JSON generation manually (no external libs)
    public String toJson() {
        return "{"
            + "\"event\":\"" + event + "\","
            + "\"severity\":\"" + severity + "\","
            + "\"method\":\"" + method + "\","
            + "\"timestamp\":\"" + timestamp + "\""
            + "}";
    }
}
