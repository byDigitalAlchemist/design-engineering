package com.dc.dp.solutions.visitor;

public interface IVisitor {
	public void visit(Phone phone);
	public void visit(Charger charger);
	public void visit(Handfree handfree);
}
