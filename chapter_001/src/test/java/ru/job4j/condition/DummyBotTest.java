package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for DummyBot.
 *
 * @version 1.0
 * @since 06.09.2018
 * @author makkez
 */
public class DummyBotTest {
	 
	/**
	 * Test on greet.
	 */
	@Test
	public void whenGreetBot() {
		DummyBot bot = new DummyBot();
		assertThat(bot.answer("Привет, Бот."), is("Привет, умник!"));
	}
	
	/**
	 * Test on byu.
	 */
	@Test
	public void whenByuBot() {
		DummyBot bot = new DummyBot();
		assertThat(bot.answer("Пока."), is("До скорой встречи."));
	}
	
	/**
	 * Test on unknown.
	 */
	@Test
	public void whenUnknownBot() {
		DummyBot bot = new DummyBot();
		assertThat(
			bot.answer("Сколько будет 2 + 2?"),
			is("Это ставит меня в тупик. Спросите другой вопрос.")
		);
	}
}