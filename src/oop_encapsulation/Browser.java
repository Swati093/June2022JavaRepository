package oop_encapsulation;

import java.util.List;

public class Browser {
	private String name;
	private String version;
	private List<String> plugin;
	
	//Const..
	public Browser(String name, String version, List<String> a) {
		this.name = name;
		this.version = version;
		this.plugin = a;
	}

	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<String> getPlugin() {
		return plugin;
	}

	public void setPlugin(List<String> plugin) {
		this.plugin = plugin;
	}
	
	
	
	

}
