package org.sm.dpc.behavioral.iterator;

public interface ChannelCollection {

	public void addChannel(Channel c);

	public void removeChannel(Channel c);

	public ChannelIterator iterator(ChannelTypeEnum type);

}
