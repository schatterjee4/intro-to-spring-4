package com.iceycake.training;

import com.iceycake.training.model.Payload;

import java.io.PrintStream;

public class CsvReporter implements Reporter {

    private PrintStream output;

    public CsvReporter() {
        this.output = System.out;
    }

    public void print(Payload payload) {
        output.println(String.format("%s\t%d\t%s", payload.getName(), payload.getValue(), payload.getDesc()));
    }
}
