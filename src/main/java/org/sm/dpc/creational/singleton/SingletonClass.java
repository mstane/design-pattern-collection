package org.sm.dpc.creational.singleton;

class SingletonClass {
    private static SingletonClass instance = null;

    private SingletonClass() {
    }

    static synchronized SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }
}