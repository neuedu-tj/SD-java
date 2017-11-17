package shopping;

public class Address {

	private int aid;
	private String aname;
	private String tel;

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aname=" + aname + ", tel=" + tel + "]";
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Address(int aid, String aname, String tel) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.tel = tel;
	}

}
