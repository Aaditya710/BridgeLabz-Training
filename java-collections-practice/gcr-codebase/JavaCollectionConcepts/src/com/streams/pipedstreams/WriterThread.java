package com.streams.pipedstreams;

import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            String message = "Hello from Writer Thread";
            pos.write(message.getBytes());
            pos.close(); // important to signal end of data
        } catch (IOException e) {
            System.out.println("Writer error");
        }
    }
}
