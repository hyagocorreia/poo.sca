package poo.sca.ui;

import poo.sca.Disciplina;
import poo.sca.SCAFacade;

public class SCA {
	
	private SCAFacade facade;
	
	public SCA(){
		this.facade = new SCAFacade();
	}
	
	public void exibirMenu(){
		StringBuffer menu = new StringBuffer();
		menu.append(">>> SISTEMA DE CONTROLE ACADÊMICO <<<<\n");
		menu.append("    0 - SAIR\n");
		menu.append("    1 - Cadastrar Disciplina\n");
		menu.append("Digite a opcao:");
		boolean fim = false;
		do{
			switch(Util.lerInteiro(menu.toString())){
			case 0:
				Util.alert("Até a próxima!");
				fim = true;
				break;
			case 1:
				cadastrarDisciplina();
				break;
			default:
				Util.alert("Opçãoo inválida!");
			}
		}while(!fim);
	}
	
	

	private void cadastrarDisciplina() {
		String nome = Util.lerString("Digite o nome da disciplina:");
		int codigo = Util.lerInteiro("Digite o código da disciplina:");
		Disciplina d = facade.criarDisciplina(nome,codigo);
		Util.alert("Disciplina criada com sucesso!\n"+d);
		
	}

	public static void main(String[] args) {
		SCA sca = new SCA();
		sca.exibirMenu();
	}

}
