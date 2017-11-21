package collection.set;

public class Stu implements Comparable<Stu> {

	int id;
	String name;
	int score;

	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	public Stu(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Stu o) {
		Stu s1 = this;
		Stu s2 = o;
		
		if(s1.score > s2.score) return -1;
		else if(s1.score < s2.score) return 1;
		else return 0;
	}

}
