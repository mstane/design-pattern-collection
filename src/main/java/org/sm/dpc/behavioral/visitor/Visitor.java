package org.sm.dpc.behavioral.visitor;

interface Visitor {

    void visit(BookVisitable item);

    void visit(CdVisitable item);

    void visit(DvdVisitable item);

}