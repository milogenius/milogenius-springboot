package com.milo.hello;

/**
 * @author: Milogenius
 * @create: 2019-05-24 15:50
 * @description:
 **/
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
