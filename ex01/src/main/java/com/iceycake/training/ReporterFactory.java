package com.iceycake.training;

import java.lang.reflect.Field;

public class ReporterFactory {

    private Reporter csvReporter;
    private Reporter htmlReporter;
    private Reporter jsonReporter;

    public ReporterFactory() {
        this.csvReporter = new CsvReporter();
        this.jsonReporter = new JsonReporter();
        this.htmlReporter = new HtmlReporter();
    }

    public Reporter getReporter(final String reporterName) {
        Reporter result = null;

        Field[] fields = ReporterFactory.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().contains(reporterName)) {
                
                break;
            }
        }

        return null;
    }

    public Reporter getReporter(final Class reporterClass) {
        return null;
    }
}
