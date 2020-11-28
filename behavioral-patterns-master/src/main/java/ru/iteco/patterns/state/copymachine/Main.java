package ru.iteco.patterns.state.copymachine;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		Map<String, String> empty = new HashMap<>();

		Map<String, String> flash = new HashMap<>();
		flash.put("Курсач", "Курсовая работа");
		flash.put("Диплом", "Дипломная работа");

		Map<String, String> wifi = new Hashtable<>();
		wifi.put("Табурет", "Заявка на табурет");
		wifi.put("Верёвка", "Заявка на верёвку");
		wifi.put("Мыло", "Заявка на мыло");

		CopyMachine copyMachine = new CopyMachine();

		copyMachine.putMoney(50);

		copyMachine.selectSource(wifi);
		copyMachine.selectDocument("Табурет");
		copyMachine.printDocument(true);

		copyMachine.selectSource(wifi);
		copyMachine.selectDocument("Верёвка");
		copyMachine.printDocument(true);

		copyMachine.selectSource(wifi);
		copyMachine.selectDocument("Мыло");
		copyMachine.printDocument(true);


		copyMachine.selectSource(empty);
		copyMachine.selectSource(flash);
		copyMachine.selectDocument("Курсач");
		copyMachine.printDocument(false);
		copyMachine.pickMoneyChange();
	}
}
