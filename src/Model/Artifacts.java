package Model;

public class Artifacts {
	
	private String plzType;
	private String plzDescription;
	private int plzStrength;
	private boolean isCorrect;
	
	public Artifacts(String plzType, String plzDescription, int plzStrength, boolean isCorrect) {
		this.plzType = plzType;
		this.plzDescription = plzDescription;
		this.plzStrength = plzStrength;
	}

	public String getPlzType() {
		return plzType;
	}

	public void setPlzType(String type) {
		this.plzType = plzType;
	}

	public String getPlzDescription() {
		return plzDescription;
	}

	public void setPlzDescription(String plzDescription) {
		this.plzDescription = plzDescription;
	}

	public int getPlzStrength() {
		return plzStrength;
	}

	public void setPlzStrength(int plzStrength) {
		this.plzStrength = plzStrength;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	

}


