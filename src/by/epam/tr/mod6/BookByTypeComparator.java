package by.epam.tr.mod6;

import java.util.Comparator;

public class BookByTypeComparator  implements Comparator<PieceOfArt>{
	public int compare(PieceOfArt p1, PieceOfArt p2){
		String type1 = p1.getType();
		String type2 = p2.getType();
		
		return type1.compareTo(type2);
	}
}
