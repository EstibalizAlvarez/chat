package com.ipartek.ejemplos.estibalizalvarez.dal;

import com.ipartek.ejemplos.estibalizalvarez.tipos.Usuario;

public class UsuariosDALFijo implements UsuariosDAL {

	private Usuario usuario;

	@Override
	public void alta(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public boolean validar(Usuario usuario) {
		return this.usuario != null && this.usuario.equals(usuario);
		// return this.usuario.getNombre().equals(usuario.getNombre()) && this.usuario.getPass().equals(usuario.getPass());
		// return this.ursio.eguals(usuario); este es el mismo que el de arriba pero simplificado.
	}

}
