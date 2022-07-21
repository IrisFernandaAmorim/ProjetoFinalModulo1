package projetoFinalBloco1;
/* Projeto final do primeiro módulo do bootcamp "Pessoa desenvolvedora JAVA" da Generation Brasil.
 * **      Contextualização    **
 * Tema --> eHealth
 * Problema --> Dificuldade de acesso da população aos serviços da UBS do seu bairro.
 * Objetivo do programa --> Desenvolver um programa capaz de realizar agendamentos, cadastro e encaminhamento de  indivíduos que
 * 							buscam pelos serviços disponibilizados na Unidade Básica de Saúde (UBS). 
 * Desenvolvido pelas alunas da turma 55: Iris Amorim, Fernanda Andrade, Marina Rosa, Stefany Souza, Dislani Melo, Cinthia Santos.*/

public class ProntuarioEletronico {

	public static void main(String[] args) {
		
			AgenteComunitario cadastro1 = new AgenteComunitario("Marina Rosa", "ACS");
			Enfermagem pct1 = new Enfermagem("Drª Fernanda Andrade", "Enfermeira Chefe");
			MedClinic pct2 = new MedClinic ("Drª Cinthia Santos","Médica Clínica Geral");
			
			
			// DEMOSNTRAÇÃO CLASSE ACS
			
			System.out.println("DISTRIBUIÇÃO DE FICHAS PARA REALIZAR CADASTRO");
	 		cadastro1.temperatura(37.0);
			cadastro1.cartaoVac(true);
			cadastro1.distribuirFicha(); 
		 	System.out.println("\nCADASTRAMENTO");
			cadastro1.cadastrar(); 
			
			// DEMONSTRAÇÃO CLASSE ENFERMAGEM
		
			System.out.println("\n");
			pct1.avisoTemperatura();
			pct1.cartaoVac(true);
			System.out.println("\n");
			pct1.procedimentos(); 
			
			// DEMONSTRAÇÃO DA CLASSE MÉDICO(A)
			
			System.out.println("\n");
			pct2.avisoTemperatura();
			pct2.temperatura(37.0);
			pct2.cartaoVac(true);
			System.out.println("\n");
			pct2.procedimentos();  
					
		}

}
