package de.bencoepp.entity.test;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Test {
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;

    @JsonProperty("subTitle")
    private String subTitle;
    @JsonProperty("executor")
    private String executor;
    @JsonProperty("runtime")
    private Long runtime;
    @JsonProperty("type")
    private String type;

    public static String TYPE_SYSTEM = "system";
    public static String TYPE_DOCKER = "docker";

    @JsonProperty("param")
    private String param;
    @JsonProperty("depth")
    private String depth;

    public static String DEPTH_SIMPLE = "simple";
    public static String DEPTH_NORMAL = "normal";
    public static String DEPTH_FULL = "full";

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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }
}
