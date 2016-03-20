package org.sm.dpc.util;

import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thoughtworks.xstream.XStream;

public class ObjectSerializer {
	
	private static final Logger logger = LoggerFactory.getLogger(ObjectSerializer.class);
	
	protected static XStream xstream = new XStream();
	
	private ObjectSerializer() {
		
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T loadObjectFromXml(String fileName) {
		InputStream inputStream = null;
		Object object = null;
		try {
			inputStream = ObjectSerializer.class.getClassLoader().getResourceAsStream(fileName);
			if (inputStream == null) {
				logger.error("File not found.");
				return null;
			}
			byte[] data = new byte[inputStream.available()];
			inputStream.read(data);
			object = xstream.fromXML(new String(data));
		} catch (IOException e) {
			logger.error("", e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (Exception e) {
					logger.error("", e);
				}
			}
		}
		return (T)object;
	}
	

}
