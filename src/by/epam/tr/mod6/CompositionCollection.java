package by.epam.tr.mod6;

import java.util.List;

public class CompositionCollection {
	private String name;
	private List<PieceOfArt> list;
	
	public CompositionCollection(String _name,List<PieceOfArt> _list){
		name = _name;
		list = _list;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public List<PieceOfArt> getList(){
		return list;
	}
	
	public void setAuthor(List<PieceOfArt> list){
		this.list = list;
	}
	
	public boolean findComposition(PieceOfArt compos){
		List<PieceOfArt> list = this.getList();
		for (int i = 0;i < list.size();i++){
			if (list.get(i).equals(compos)){
				return true;
			} 
		}
		return false;
	}		
}
