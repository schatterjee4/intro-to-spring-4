package com.iceycake.training;

import com.iceycake.training.model.Payload;

import java.io.PrintStream;

public class HtmlReporter implements Reporter {

    private PrintStream os;

    public HtmlReporter() {
        os = System.out;
    }

    public void print(final Payload payload) {
        os.println("<html>");
        os.println("<body>");
        os.println(String.format("<h1>%s</h1>", payload.getName()));
        os.println(String.format("%s", payload.getDesc()));
        os.println(String.format("<li>%d</li>", payload.getValue()));
        os.println("</body>");
        os.println("</html>");
    }
}
