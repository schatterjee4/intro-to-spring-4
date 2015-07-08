package com.iceycake.training;

import com.iceycake.training.model.Payload;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.PrintStream;

public class JsonReporter implements Reporter {

    private PrintStream output;
    private ObjectMapper mapper;

    public JsonReporter() {
        this.output = System.out;
        this.mapper = new ObjectMapper();
    }

    public void print(final Payload payload) {
        try {
            mapper.writeValue(output, payload);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
