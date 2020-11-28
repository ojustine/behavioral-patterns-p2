package ru.iteco.patterns.state.copymachine;

public class PrintDocumentState extends SelectDocumentState {
	@Override
	public void printDocument(CopyMachine copyMachine) {
		if (copyMachine.getMoney() < CopyMachine.getPrice()) {
			System.out.println("Недостаточно денег");
			copyMachine.setState(new PutMoneyState());
		} else {
			System.out.print("Печатается документ \"" + copyMachine.getDocName() +"\" : ");
			System.out.println(copyMachine.getSource().remove(copyMachine.getDocName()));
			copyMachine.setMoney(copyMachine.getMoney() - CopyMachine.getPrice());
			if (copyMachine.isOneMoreDoc()) {
				copyMachine.setState(new SelectSourceState());
			} else {
				copyMachine.setState(new PickMoneyChange());
			}
		}
	}
}
