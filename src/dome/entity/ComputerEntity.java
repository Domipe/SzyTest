package dome.entity;

public class ComputerEntity {
	private String compterModel;
	private String compterVer;
	private String compterInfo;

	public ComputerEntity() {
	}

	public ComputerEntity(String model, String ver, String info) {
		this.compterInfo = info;
		this.compterModel = model;
		this.compterVer = ver;
	}

	public String getModel() {
		return compterModel;
	}

	public void setModel(String model) {
		this.compterModel = model;

	}

	public String getVer() {
		return compterVer;
	}

	public void setVer(String ver) {
		this.compterVer = ver;
	}

	public String getInfo() {
		return compterInfo;
	}

	public void setInfo(String info) {
		this.compterInfo = info;
	}

}