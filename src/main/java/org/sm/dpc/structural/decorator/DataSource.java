package org.sm.dpc.structural.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}

