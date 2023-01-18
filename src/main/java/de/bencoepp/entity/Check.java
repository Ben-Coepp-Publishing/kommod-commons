package de.bencoepp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Check {
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("command")
    private String command;
    @JsonProperty("ok")
    private Boolean ok;

    public Check(){}

    public Check(String title, String description, String command, Boolean ok) {
        this.title = title;
        this.description = description;
        this.command = command;
        this.ok = ok;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }
}
