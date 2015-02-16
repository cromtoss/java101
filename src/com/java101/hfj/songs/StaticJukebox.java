/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/songs/StaticJukebox.java#1 $
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
public final class StaticJukebox {

	public static void playSongs(List<Song> songs) {
		for (Song song : songs) {
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

		StaticJukebox.playSongs(topSellers);
	}

}
