package projetoFinalBloco1;
/* Projeto final do primeiro módulo do bootcamp "Pessoa desenvolvedora JAVA" da Generation Brasil.
 * **      Contextualização    **
 * Tema --> eHealth
 * Problema --> Dificuldade de acesso da população aos serviços da UBS do seu bairro.
 * Objetivo do programa --> Desenvolver um programa capaz de realizar agendamentos, cadastro e encaminhamento de  indivíduos que
 * 							buscam pelos serviços disponibilizados na Unidade Básica de Saúde (UBS). 
 * Desenvolvido pelas alunas da turma 55: Iris Amorim, Fernanda Andrade, Marina Rosa, Stefany Souza, Dislani Melo, Cinthia Santos.*/

public abstract class Especialidades implements UBS {
	
	//ATRIBUTOS DA CLASSE
	
	protected String cartSus;
	protected int idade;
	protected String endereco;
	protected String cpf;
	protected double altura;
	protected double peso;
	protected Boolean has;
	protected Boolean dm;
	protected String nome;

	
	// MÉTODO CONSTRUTOR
	public Especialidades (String nomeProfissional, String especialidade)
	{
		System.out.println("\nProfissional: "+nomeProfissional+" - "+especialidade);
	}
	
	
	// MÉTODOS ABSTRATOS (Serão implementados nas próximas fases do projeto)
	abstract public void cadastrar();
	abstract public void marcarConsulta();
	abstract public void visitar();
	abstract public void encaminhar();
	abstract public void medicar();

	
	//MÉTODOS HERDADOS DA INTERFACE
	
	@Override
	public void cartaoVac(boolean CartaoVac) {
				
	}
	
	@Override
	public void temperatura(double testeTemperatura) {
		
	}

	@Override
	public void avisoTemperatura() {
		
		
	}
	
}
	

