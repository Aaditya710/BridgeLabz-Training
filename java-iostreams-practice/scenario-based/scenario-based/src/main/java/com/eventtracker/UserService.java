package com.eventtracker;

public class UserService {

    @AuditTrail(event = "USER_LOGIN", severity = "LOW")
    public void login(String username) {
        System.out.println(username + " logged in");
    }

    @AuditTrail(event = "FILE_UPLOAD", severity = "MEDIUM")
    public void uploadFile(String filename) {
        System.out.println("File uploaded: " + filename);
    }

    @AuditTrail(event = "FILE_DELETE", severity = "HIGH")
    public void deleteFile(String filename) {
        System.out.println("File deleted: " + filename);
    }
}
