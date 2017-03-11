package by.epam.tr.mod6;

public class Novel extends PieceOfArt{
	private String novelType;
	
	public Novel(String name, String author){
		super(name,author);
		this.setType("novel");
		novelType = "";
	}
	
	public Novel(String name, String author, String _novelType){
		super(name,author);
		this.setType("novel");
		novelType = _novelType;
	}
	
	public String getNovelType(){
		return novelType;
	}
	
	public void setNovelType(String novelType){
		this.novelType = novelType;
	}
	
	@Override
	public String toString(){
		return novelType + " " + this.getType() + " '" + this.getName() + "' is written by " + this.getAuthor();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((novelType == null) ? 0 : novelType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Novel other = (Novel) obj;
		
		if (this.getAuthor() == null) {
			if (other.getAuthor() != null)
				return false;
		} else if (!this.getAuthor().equals(other.getAuthor()))
			return false;
		if (this.getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!this.getName().equals(other.getName()))
			return false;
		if (novelType == null) {
			if (other.novelType != null)
				return false;
		} else if (!novelType.equals(other.novelType))
			return false;
		return true;
	}
	
	
	

}
