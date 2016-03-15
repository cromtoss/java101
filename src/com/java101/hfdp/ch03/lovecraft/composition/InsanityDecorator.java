package com.java101.hfdp.ch03.lovecraft.composition;

import com.java101.hfdp.ch03.lovecraft.ElderOne;

/**
 * A decorator that allows ElderOnes to make you insane.
 */
public class InsanityDecorator implements ElderOne {

    private ElderOne elderOne;


    public InsanityDecorator(ElderOne elderOne) {
        this.elderOne = elderOne;
    }


    @Override
    public String getName() {
        return elderOne.getName();
    }

    @Override
    public void setName(String name) {
        elderOne.setName(name);
    }

    @Override
    public String getNickname() {
        return elderOne.getNickname();
    }

    @Override
    public void setNickname(String nickname) {
        elderOne.setNickname(nickname);
    }

    @Override
    public String getAuthor() {
        return elderOne.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        elderOne.setAuthor(author);
    }

    @Override
    public String getDescription() {
        return elderOne.getDescription();
    }

    @Override
    public void setDescription(String description) {
        elderOne.setDescription(description);
    }

    @Override
    public void speakFromBeyond() {
        elderOne.speakFromBeyond();
        System.out.println("A crazed voice heard from elsewhere");
    }
}
