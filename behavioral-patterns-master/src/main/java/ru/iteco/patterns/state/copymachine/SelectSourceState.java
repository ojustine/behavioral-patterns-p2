package ru.iteco.patterns.state.copymachine;

public class SelectSourceState extends PutMoneyState {
	@Override
	public void putMoney(CopyMachine copyMachine) {
		System.out.println("Деньги уже внесены");
	}

	@Override
	public void selectSource(CopyMachine copyMachine) {
		if (copyMachine.getSource().isEmpty()) {
			System.out.println("На устройстве нет документов");
		} else {
			System.out.println("Выбрано устройство " + copyMachine.getSource().getClass());
			copyMachine.setState(new SelectDocumentState());
		}
	}

	@Override
	public void selectDocument(CopyMachine copyMachine) {
		System.out.println("Необходимо сначала выбрать устройство");
	}

	@Override
	public void printDocument(CopyMachine copyMachine) {
		System.out.println("Необходимо сначала выбрать устройство");
	}

	@Override
	public void pickMoneyChange(CopyMachine copyMachine) {
		System.out.println("Сдача: " + copyMachine.getMoney());
		copyMachine.setMoney(0);
		copyMachine.setSource(null);
		copyMachine.setState(new PutMoneyState());
	}
}
