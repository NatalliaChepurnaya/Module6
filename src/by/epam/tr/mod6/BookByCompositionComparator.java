package by.epam.tr.mod6;

import java.util.Comparator;

public class BookByCompositionComparator  implements Comparator<PieceOfArt>{
	public int compare(PieceOfArt p1, PieceOfArt p2){
		String author1 = p1.getAuthor();
		String author2 = p2.getAuthor();
		String name1 = p1.getName();
		String name2 = p2.getName();
		
		if (author1.compareTo(author2) == 0){
			return name1.compareTo(name2);
		} else {
			return author1.compareTo(author2);
		}
	}

}
