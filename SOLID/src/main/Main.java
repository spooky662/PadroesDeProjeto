package main;

import repository.RetornoRepository;
import service.EmailService;

public class Main {

	public static void main(String[] args) {
		Retorno retorno = new Retorno();
        retorno.gerarRetorno();

        RetornoRepository repo = new RetornoRepository();
        repo.salvarNoBD();

        EmailService email = new EmailService();
        email.enviarParaEmail();
	}

}
