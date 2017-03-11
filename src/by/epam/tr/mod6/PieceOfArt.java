package by.epam.tr.mod6;

public class PieceOfArt {
	private String type;
	private String name;
	private String author;
	
	{
		type = "unknown";
	}
	
	public PieceOfArt(String _name){	
		name = _name;
		author = "unknown";
	}
	
	public PieceOfArt(String _name, String _author){
		name = _name;
		author = _author;
	}
	
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
		
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	@Override
	public String toString(){
		return type + " book " + name + " is written by " + author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PieceOfArt other = (PieceOfArt) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

