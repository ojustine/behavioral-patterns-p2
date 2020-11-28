package ru.iteco.patterns.state.copymachine;

import java.util.Map;

public interface State {

	void putMoney(CopyMachine copyMachine);

	void selectSource(CopyMachine copyMachine);

	void selectDocument(CopyMachine copyMachine);

	void printDocument(CopyMachine copyMachine);

	void pickMoneyChange(CopyMachine copyMachine);

}
