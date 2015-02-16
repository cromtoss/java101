/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/songs/Jukebox.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.songs;

import java.util.ArrayList;
import java.util.List;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class Jukebox {

	public static final String MODEL;
	public static String WOOD_FINISH;

	static {
		MODEL = "Wurlitzer";
		WOOD_FINISH = "Teak";
	}

	private List<Song> loadedSongs;


	public Jukebox(List<Song> songsToLoad) {
		loadedSongs = songsToLoad;
	}





	public void playSongs() {
		for (Song song : loadedSongs) {
			song.play();
		}
	}


	public static void main(String[] args) {
		Song elvis = new Song("Surrender");
		Song cash = new Song("Ring of Fire");
		Song gaga = new Song("Applause");

		List<Song> topSellers = new ArrayList<>();
		topSellers.add(elvis);
		topSellers.add(cash);
		topSellers.add(gaga);

		Jukebox player = new Jukebox(topSellers);
		player.playSongs();
	}


}
