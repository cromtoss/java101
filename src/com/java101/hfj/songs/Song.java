/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/songs/Song.java#1 $
 *
 *	Copyright � 2013 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.songs;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class Song {

	private String songTitle;

	public Song(String songTitle) {
		if (songTitle == null) {
			System.out.println("NO!");
		}

		this.songTitle = songTitle;
	}

	public void play() {
		System.out.println("The melodious rhythms of " + songTitle + " emerge!");
	}

}
