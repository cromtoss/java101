/*	$Header: //software/misc/user/crosta/java101/src/com/devket/hfj/ch16/Book.java#1 $
 *
 *	Copyright � 2014 Pearson VUE. All rights reserved.
 */

package com.java101.hfj.ch16;

/**
 *  //tcTODO
 *
 *  @author Tom Cross
 *  @version $Revision: #1 $ submitted $DateTime: 2014/03/11 11:34:00 $ by $Author: crosta $	
 */
public final class Book {

	private String title;
	private String author;


	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		final Book book = (Book)o;

		if (!author.equals(book.author)) return false;
		if (!title.equals(book.title)) return false;

		return true;
	}


	@Override
	public int hashCode() {
		int result = title.hashCode();
		result = 31 * result + author.hashCode();
		return result;
	}
}
