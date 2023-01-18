package de.bencoepp.entity.test;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Test {
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("stages")
    private ArrayList<Stage> stages;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public void setStages(ArrayList<Stage> stages) {
        this.stages = stages;
    }
}
