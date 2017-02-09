package br.unisal.produtos.component;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.unisal.produtos.modelo.Usuario;

@Component
@SessionScoped
public class UsuarioLogado {
	private Usuario usuarioLogado;
	
	public void efetuaLogin(Usuario usuario){
		this.usuarioLogado = usuario;
	}

	public Usuario getUsuario() {
		return usuarioLogado;
	}
}
