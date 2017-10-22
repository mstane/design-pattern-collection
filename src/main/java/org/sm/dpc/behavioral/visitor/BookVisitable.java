package org.sm.dpc.behavioral.visitor;

class BookVisitable implements Visitable {
    private double price;
    private double weight;

    BookVisitable(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    double getPrice() {
        return price;
    }

    double getWeight() {
        return weight;
    }

}
