
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id
	private int cid;

	private String cname;
	private String continent;

//	@OneToMany(cascade = CascadeType.PERSIST)
//	@OneToMany(cascade = CascadeType.MERGE)
//	@OneToMany(cascade = CascadeType.REMOVE)
//	@OneToMany(cascade = CascadeType.REFRESH)
//	@OneToMany(cascade = CascadeType.DETACH)
	@OneToMany(cascade = CascadeType.ALL)
	private List<Aircraft> aircraft;

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", continent=" + continent + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public List<Aircraft> getAircraft() {
		return aircraft;
	}

	public void setAircraft(List<Aircraft> aircraft) {
		this.aircraft = aircraft;
	}

}
