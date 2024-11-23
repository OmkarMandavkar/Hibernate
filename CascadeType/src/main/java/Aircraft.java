
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aircraft {

	@Id
	private int id;

	private String name;
	private int generation;

	@Override
	public String toString() {
		return "Aircraft [id=" + id + ", name=" + name + ", generation=" + generation + "]";
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

	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

}
