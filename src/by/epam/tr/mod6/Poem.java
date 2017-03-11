package by.epam.tr.mod6;

public class Poem extends PieceOfArt{
	private String verseSize;
		
	public Poem(String name, String author){
		super(name,author);
		this.setType("poem");
		verseSize = "unknown";
	}
	
	public Poem(String name, String author, String _verseSize){
		super(name,author);
		this.setType("poem");
		verseSize = _verseSize;
	}
	
	public String getVerseSize(){
		return verseSize;
	}
	
	public void setVerseSize(String verseSize){
		this.verseSize = verseSize;
	}
	
	@Override
	public String toString(){
		return this.getType() + " '" + this.getName() + "' is written in " + verseSize + " verse size by " + this.getAuthor();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((verseSize == null) ? 0 : verseSize.hashCode());
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
		Poem other = (Poem) obj;
		
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
		if (verseSize == null) {
			if (other.verseSize != null)
				return false;
		} else if (!verseSize.equals(other.verseSize))
			return false;
		return true;
	}
}
