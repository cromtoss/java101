/*	$Header: $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfdp.builder;

/**
 *  Frammis. Make objects of this type using {@link FrammisBuilder}.
 *
 *  Immutable!
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/06/06 14:58:00 $ by $Author: CROSTA $	
 */
public class Frammis {

	private final String alpha;
	private final String bravo;
	private final String charlie;
	private final String delta;
	private final String echo;
	private final String foxtrot;
	private final String golf;
	private final String hotel;
	private final String indigo;


	/**
	 * Private. Uses Builder pattern.
	 */
	private Frammis(String alpha, String bravo, String charlie, String delta, String echo, String foxtrot, String golf, String hotel, String indigo) {
		this.alpha = alpha;
		this.bravo = bravo;
		this.charlie = charlie;
		this.delta = delta;
		this.echo = echo;
		this.foxtrot = foxtrot;
		this.golf = golf;
		this.hotel = hotel;
		this.indigo = indigo;
	}


	public String getAlpha() {
		return alpha;
	}


	public String getBravo() {
		return bravo;
	}


	public String getCharlie() {
		return charlie;
	}


	public String getDelta() {
		return delta;
	}


	public String getEcho() {
		return echo;
	}


	public String getFoxtrot() {
		return foxtrot;
	}


	public String getGolf() {
		return golf;
	}


	public String getHotel() {
		return hotel;
	}


	public String getIndigo() {
		return indigo;
	}


	/**
	 * Builder pattern. Create {@link Frammis} objects.
	 */
	public static class FrammisBuilder {

		private String alpha;
		private String bravo;
		private String charlie;
		private String delta;
		private String echo;
		private String foxtrot;
		private String golf;
		private String hotel;
		private String indigo;

		public FrammisBuilder() {}

		public Frammis build() {

			Integer x = 42;
			Integer x_prime = 42;
			Integer y = new Integer(42);
			Integer z = new Integer(42);
			Integer a = new Integer(42);
			Integer b = new Integer(42);
			Integer c = new Integer(42);

			if (x == x_prime) {
				System.out.println("Wow");
			}

			if (y == z) {
				System.out.println("Not expected");
			}

			String stringX = "tom";
			String stringY = new String("tom");

			// Validate alpha-golf are not null
			// Apply default to hotel if not set
			// Apply default to indigo if not set

			// return new Frammis()
			return new Frammis(alpha, bravo, charlie, delta, echo, foxtrot, golf, hotel, indigo);

		}


		public void setAlpha(String alpha) {
			this.alpha = alpha;
		}


		public void setBravo(String bravo) {
			this.bravo = bravo;
		}


		public void setCharlie(String charlie) {
			this.charlie = charlie;
		}


		public void setDelta(String delta) {
			this.delta = delta;
		}


		public void setEcho(String echo) {
			this.echo = echo;
		}


		public void setFoxtrot(String foxtrot) {
			this.foxtrot = foxtrot;
		}


		public void setGolf(String golf) {
			this.golf = golf;
		}


		public void setHotel(String hotel) {
			this.hotel = hotel;
		}


		public void setIndigo(String indigo) {
			this.indigo = indigo;
		}
	}
}
