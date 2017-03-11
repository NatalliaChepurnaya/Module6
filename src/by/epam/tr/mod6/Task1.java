package by.epam.tr.mod6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task1 {
	public static void main(String[] args){
		List<PieceOfArt> list = new ArrayList<PieceOfArt>();
		PieceOfArt novel = new Novel("The Great Gatsby","Scott Fitzgerald");
		CompositionCollection collection = new Book("Book1",list);
		Comparator<PieceOfArt> authorComp = new BookByAuthorComparator();
		Comparator<PieceOfArt> booksComp = new BookByCompositionComparator();
		Comparator<PieceOfArt> typeComp = new BookByTypeComparator();
		
		//Add compositions
		list.add(new Novel("Lolita","Nabokov","sexual"));
		list.add(new Novel("An american tragedy","Theodore Dreiser"));
		list.add(new Poem("A dream within a dream","Edgar Allan Poe"));
		list.add(new Poem("Life is fine","Langston Hughes","trochee"));
		list.add(new Novel("This side of paradize","Scott Fitzgerald"));
		list.add(new Novel("The Great Gatsby","Scott Fitzgerald"));
		
		//Sort collection
		System.out.println("Sort by author:");
		collection.getList().sort(authorComp);
		System.out.println(collection.toString());
		
		System.out.println("Sort by composition:");
		collection.getList().sort(booksComp);
		System.out.println(collection.toString());
		
		System.out.println("Sort by type:");
		collection.getList().sort(typeComp);
		System.out.println(collection.toString());
		
		//Find composition in the book
		System.out.println(collection.findComposition(novel));
	}

}
