package com.ycncc.common.enums;

public enum FileType {

    /**
     *
     */
    dto("Dto", "/dto"),
    form("Form", "/form"),
    repository("Repository", "/repository"),
    service("Service", "/service"),
    serviceImpl("ServiceImpl", "/service/impl"),
    controller("Controller", "/controller/manage"),
    vue_add("vue_add", "add.vue"),
    vue_index("vue_index", "index.vue"),
    vue_request("vue_request", "request.js"),
    ;

    /**
     * 首字母大写的格式
     */
    private String text;
    /**
     * 这类文件的创建位置
     */
    private String path;

    private FileType(String text, String path) {
        this.text = text;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public String getText() {
        return this.text;
    }
}
