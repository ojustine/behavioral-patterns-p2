package ru.iteco.patterns.state.copymachine;

public class PutMoneyState implements State {
	@Override
	public void putMoney(CopyMachine copyMachine) {
		System.out.println("Внесено " + copyMachine.getMoney() + " рублей");
		copyMachine.setState(new SelectSourceState());
	}

	@Override
	public void selectSource(CopyMachine copyMachine) {
		throw new RuntimeException("Необходимо сначала внести деньги");
	}

	@Override
	public void selectDocument(CopyMachine copyMachine) {
		throw new RuntimeException("Необходимо сначала внести деньги");
	}

	@Override
	public void printDocument(CopyMachine copyMachine) {
		throw new RuntimeException("Необходимо сначала внести деньги");
	}

	@Override
	public void pickMoneyChange(CopyMachine copyMachine) {
		throw new RuntimeException("Необходимо сначала внести деньги");
	}
}
