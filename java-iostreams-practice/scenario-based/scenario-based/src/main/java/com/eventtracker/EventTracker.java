package com.eventtracker;

import java.lang.reflect.Method;
import java.util.*;

public class EventTracker {

    public static List<String> trackEvents(Class<?> clazz) {

        List<String> auditLogs = new ArrayList<>();

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(AuditTrail.class)) {

                AuditTrail audit = method.getAnnotation(AuditTrail.class);

                AuditLog log = new AuditLog(
                        audit.event(),
                        audit.severity(),
                        method.getName()
                );

                auditLogs.add(log.toJson());
            }
        }
        return auditLogs;
    }
}

