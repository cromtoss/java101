package com.java101.hfdp.ch03.lovecraft.composition.haiku;

import com.java101.hfdp.ch03.lovecraft.ElderOne;
import com.java101.hfdp.ch03.lovecraft.OtherworldlySpeaker;
import com.java101.hfdp.ch03.lovecraft.composition.EclipseDecorator;
import com.java101.hfdp.ch03.lovecraft.ElderOneDefault;
import com.java101.hfdp.ch03.lovecraft.composition.GibberingDecorator;
import com.java101.hfdp.ch03.lovecraft.composition.InsanityDecorator;

/**
 * Generates haiku poems for a variety of Elder Ones. This version uses decorators that apply the same interface as the components,
 * and implement the delegation manually.
 */
public class HaikuGeneratorSimple {

    private static ElderOne NYARLATHOTEP = new ElderOneDefault(
            "Nyarlathotep",
            "The Black Pharaoh",
            "H.P. Lovecraft",
            "He is active and frequently walks the Earth in the guise of a human being, usually a tall, slim, joyous man. He has \"a thousand\" other forms, most of these reputed to be maddeningly horrific.",
            "The crawling chaos"
    );


    private static ElderOne HASTUR = new ElderOneDefault(
            "Hastur",
            "The King in Yellow",
            "Ambrose Bierce",
            "Its true form is unknown, but usually manifests either as a polypous, ravenous floating mass endowed with tentacles, drills and suckers or, more frequently, as the King in Yellow, a humanoid being wearing tattered, yellow clothes and a mask hiding the face. It is said to be Cthulhu's (half-)brother.",
            "The King In Yellow"
    );


    public static void main(String[] args) {
        final OtherworldlySpeaker enhancedNyarlathotep = new GibberingDecorator(new InsanityDecorator(NYARLATHOTEP));
        enhancedNyarlathotep.speakFromBeyond();

        System.out.println();

        final OtherworldlySpeaker spiffyHastur = new EclipseDecorator(new InsanityDecorator(HASTUR));
        spiffyHastur.speakFromBeyond();
    }
}
