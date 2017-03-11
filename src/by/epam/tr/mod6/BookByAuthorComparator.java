package by.epam.tr.mod6;

import java.util.Comparator;

public class BookByAuthorComparator implements Comparator<PieceOfArt>{
	public int compare(PieceOfArt p1, PieceOfArt p2){
		String author1 = p1.getAuthor();
		String author2 = p2.getAuthor();
		
		return author1.compareTo(author2);
	}

}
