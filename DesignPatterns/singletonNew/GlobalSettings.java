package singletonDPpackage;

public class GlobalSettings {
	
	private String serverip;
	private String defaultIP = "172.168.1.1";
	private String defaultPrefixIP = "172.168.1.";
	
	GlobalSettings() {
		this.serverip = defaultIP;
	}
	
	GlobalSettings(String ip){
		this.serverip = ip;
	}
		
	public String getServerIP() {
		return serverip;
	}

	public void setServerIP(String ip) {
		serverip = ip;
	}
	
	public String getDefaultPrefixIP() {
		return defaultPrefixIP;
	}
}
