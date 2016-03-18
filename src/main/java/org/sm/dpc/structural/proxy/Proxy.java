package org.sm.dpc.structural.proxy;

public class Proxy implements Server {
	
	private final Server server;
	
	private File file;
	
	public Proxy(final Server server) {
		this.server = server;
	}

	@Override
	public File getFile(String fileName) {
		if (file == null || !file.getName().equals(fileName)) {
			file = server.getFile(fileName);
		}
		return file;
	}

}
