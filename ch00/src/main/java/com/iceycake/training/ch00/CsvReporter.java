package com.iceycake.training.ch00;

import com.iceycake.training.ch00.model.Payload;

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
