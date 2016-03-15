package com.java101.hfdp.ch03.lovecraft;

/**
 * Default implementation for a concrete ElderOne.
 */
public class ElderOneDefault implements ElderOne {

    private String name;
    private String nickname;
    private String author;
    private String description;
    private String speech;


    public ElderOneDefault(String name, String nickname, String author, String description, String speech) {
        this.name = name;
        this.nickname = nickname;
        this.author = author;
        this.description = description;
        this.speech = speech;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNickname() {
        return nickname;
    }

    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void speakFromBeyond() {
        System.out.println(speech);
    }
}
