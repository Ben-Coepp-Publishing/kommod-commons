package de.bencoepp.entity.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Test {
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("executor")
    private String executor;
    @JsonProperty("runtime")
    private Long runtime;
    @JsonProperty("runtime")
    private String type;

    private static String TYPE_SYSTEM = "system";
    private static String TYPE_DOCKER = "docker";

    @JsonProperty("param")
    private String param;

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

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public Long getRuntime() {
        return runtime;
    }

    public void setRuntime(Long runtime) {
        this.runtime = runtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
