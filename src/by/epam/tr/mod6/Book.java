package by.epam.tr.mod6;

import java.util.List;

public class Book extends CompositionCollection {// куда пропали методы equals и HashCode - объект класса ведь данные хранит.
	private String edition;
	
	public Book(String _name,List<PieceOfArt> _list){
		super(_name,_list);
		edition = "unknown";
	}
	
	public Book(String _name,List<PieceOfArt> _list,String _edition){
		super(_name,_list);
		edition = _edition;
	}
	
	public String getEdition(){
		return edition;
	}
	
	public void setEdition(String edition){
		this.edition = edition;
	}
	
	public String toString(){
		String str = "Book in it's " + edition + " edition contains:\n";
		List<PieceOfArt> list = this.getList();
		for (int i = 0;i < list.size();i++){
			 str += list.get(i).toString() + "\n";
		}
		return str;
	}
}
