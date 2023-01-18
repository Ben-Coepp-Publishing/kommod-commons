package de.bencoepp.entity.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Step {
    @JsonProperty("title")
    private String title;
    @JsonProperty("commands")
    private String[] commands;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
}
