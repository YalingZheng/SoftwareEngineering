package singletonDPpackage;

public class EagerSingletonGlobalSettings {
	
	private static EagerSingletonGlobalSettings globalsettings = new EagerSingletonGlobalSettings();
	
	private static String serverip = null;
	private String defaultIP = "172.168.1.1";
	private String defaultPrefixIP = "172.168.1.";
	
	private EagerSingletonGlobalSettings() {
		if (serverip==null)
			serverip = defaultIP;
	}
	
	private EagerSingletonGlobalSettings(String ip){
		serverip = ip;
	}
	
	public static EagerSingletonGlobalSettings getInstance() {
		return globalsettings;
	}
	
	public static String getServerIP() {
		return serverip;
	}

	public synchronized void setServerIP(String ip) {
		serverip = ip;
	}
	
	public String getDefaultPrefixIP() {
		return defaultPrefixIP;
	}
	
	@Override
	public EagerSingletonGlobalSettings clone() {
		//throw new CloneNotSupportedException(); 
		//System.out.println("SingletonGlobalSettings does not support Clone method");
		return null;
	}
}
