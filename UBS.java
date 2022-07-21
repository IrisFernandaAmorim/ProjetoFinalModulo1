package projetoFinalBloco1;
/* Projeto final do primeiro módulo do bootcamp "Pessoa desenvolvedora JAVA" da Generation Brasil.
 * **      Contextualização    **
 * Tema --> eHealth
 * Problema --> Dificuldade de acesso da população aos serviços da UBS do seu bairro.
 * Objetivo do programa --> Desenvolver um programa capaz de realizar agendamentos, cadastro e encaminhamento de  indivíduos que
 * 							buscam pelos serviços disponibilizados na Unidade Básica de Saúde (UBS). 
 * Desenvolvido pelas alunas da turma 55: Iris Amorim, Fernanda Andrade, Marina Rosa, Stefany Souza, Dislani Melo, Cinthia Santos.*/

public interface UBS {
		
	// MÉTODOS DA INTERFACE
			
		void temperatura(double testeTemperatura);
		void avisoTemperatura();
		void cartaoVac(boolean CartaoVac);
			
}
