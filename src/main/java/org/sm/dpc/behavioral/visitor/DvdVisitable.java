package org.sm.dpc.behavioral.visitor;

public class DvdVisitable implements Visitable {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
