package com.iceycake.training.ch00;

import com.iceycake.training.ch00.model.Payload;

public class Application {

    private Reporter reporter;

    public Application() {

    }

    public void setReporter(final Reporter reporter) {
        this.reporter = reporter;
    }

    public void run() {
        Payload payload = new Payload();
        payload.setName("Tommy");
        payload.setValue(14);
        payload.setDesc("This is a demo.");

        this.reporter.print(payload);
    }

    public static void main(final String[] args) {
        Application application = new Application();
        application.setReporter(new CsvReporter());
        application.run();
    }

}
