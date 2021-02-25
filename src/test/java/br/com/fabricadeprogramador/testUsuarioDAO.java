package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class testUsuarioDAO {

	public static void main(String[] args) {
		
		//testCadastrar();
		//testAlterar();
		testExcluir();
	}

	private static void testCadastrar() {
		Usuario usu = new Usuario();
		usu.setNome("Jãozão");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso");
	}
	private static void testAlterar() {
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Jãozão sa Silva");
		usu.setLogin("jzaoss");
		usu.setSenha("12345678");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso");
	}
	private static void testExcluir() {
		Usuario usu = new Usuario();
		usu.setId(4);
			
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Excluido com sucesso");
	}

}
