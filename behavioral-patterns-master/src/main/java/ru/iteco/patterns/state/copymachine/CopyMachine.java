package ru.iteco.patterns.state.copymachine;

import java.util.Map;

public class CopyMachine {
	private static final int PRICE = 5;
	private State state;
	private int money;
	private Map<String, String> source;
	private String docName;
	private boolean oneMoreDoc;

	public CopyMachine() {
		this.state = new PutMoneyState();
	}

	public void putMoney(int money) {
		if (money <= 0) {
			throw new RuntimeException("Некорректная сумма");
		}
		this.money = money;
		state.putMoney(this);
	}

	public void	selectSource(Map<String, String> source) {
		this.source = source;
		state.selectSource(this);
	}

	public void selectDocument(String docName) {
		this.docName = docName;
		state.selectDocument(this);
	}

	public void printDocument(boolean oneMoreDoc) {
		this.setOneMoreDoc(oneMoreDoc);
		state.printDocument(this);
	}

	public void pickMoneyChange() {
		state.pickMoneyChange(this);
	}

	public static int getPrice() {
		return PRICE;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Map<String, String> getSource() {
		return source;
	}

	public void setSource(Map<String, String> source) {
		this.source = source;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public boolean isOneMoreDoc() {
		return oneMoreDoc;
	}

	public void setOneMoreDoc(boolean oneMoreDoc) {
		this.oneMoreDoc = oneMoreDoc;
	}
}
