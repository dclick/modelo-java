package io.redspark.controller;

import static io.redspark.compose.Compose.admin;
import io.redspark.SescApplicationTest;
import io.redspark.domain.User;

import org.junit.Test;
import org.springframework.http.HttpStatus;

public class MailControllerTest extends SescApplicationTest {

	@Test
	public void sendMailTest() {

		User caio = admin("caio").build();
		saveall(caio);
		signIn(caio);

		get("/send-mail").queryParam("to", "caio.ferreira@dclick.com.br").expectedStatus(HttpStatus.OK);

	}
}
