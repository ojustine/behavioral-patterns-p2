package ru.iteco.patterns.state.copymachine;

public class PickMoneyChange extends PrintDocumentState {
	@Override
	public void printDocument(CopyMachine copyMachine) {
		System.out.println("Необходимо сначала выбрать документ");
		copyMachine.setState(new SelectDocumentState());
	}
}
