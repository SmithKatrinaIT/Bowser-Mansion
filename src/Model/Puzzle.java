package Model;

public class Puzzle {

	private int id;
	private String description;
	private String answer;
	private boolean isCorrect;
	
	public Puzzle (int id, String description, String answer, boolean isCorrect){
		this.id = id;
		this.description = description;
		this.answer = answer;
		this.isCorrect = isCorrect;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	
}
