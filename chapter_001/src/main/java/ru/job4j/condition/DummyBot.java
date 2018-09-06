package ru.job4j.condition;

/**
 * Класс, описывающий простого бота.
 *
 * @version 1.0
 * @since 06.09.2018
 * @author makkez
 */
 public class DummyBot {
	 
	 /**
	  * Метод, реализующий ответы на вопросы
	  *
	  * @param question Вопрос от клиента.
	  * @return Ответ.
	  */
	  public String answer(String question) {
		  String response = "Это ставит меня в тупик. Спросите другой вопрос.";
		  
		  if ("Привет, Бот.".equals(question)) {
			  response = "Привет, умник!";
		  } else if ("Пока.".equals(question)) {
			  response = "До скорой встречи.";
		  }
		  
		  return response;
	  }
 }