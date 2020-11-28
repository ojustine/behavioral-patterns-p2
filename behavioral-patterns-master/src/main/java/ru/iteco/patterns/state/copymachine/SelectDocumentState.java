package ru.iteco.patterns.state.copymachine;

public class SelectDocumentState extends SelectSourceState {
	@Override
	public void selectSource(CopyMachine copyMachine) {
		System.out.println("Устройство уже выбрано");
	}

	@Override
	public void selectDocument(CopyMachine copyMachine) {
		if (copyMachine.getSource().containsKey(copyMachine.getDocName())) {
			System.out.println("Выбран документ \"" + copyMachine.getDocName() +"\"");
			copyMachine.setState(new PrintDocumentState());
		} else {
			System.out.println("Документ \"" + copyMachine.getDocName() + "\" отсутствует на устройстве");
		}
	}

	@Override
	public void printDocument(CopyMachine copyMachine) {
		System.out.println("Необходимо сначала выбрать документ");
	}
}
