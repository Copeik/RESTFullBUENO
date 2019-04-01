package com.copeik.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;
import com.copeik.hibernate.entity.Usuario;
import com.copeik.hibernate.repository.GestorUsuario;

@Service("usuarioService")
public class UsuarioService implements UserDetailsService {
	
	@Autowired
	@Qualifier("gestorUsuario")
	private GestorUsuario repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = repo.findByUsuario(username);
		return new User(user.getUsuario(), user.getContrasena(), 
				user.isActivo(), user.isActivo(), user.isActivo(), user.isActivo(), buildgrante((byte)user.getRol().getId_rol()) );
	}
	
	public List<GrantedAuthority> buildgrante(byte rol){
		String[] roles = {"LECTOR","USUARIO","ADMINISTRADOR"};
		List<GrantedAuthority> auths = new ArrayList<>();
		for(int i = 0; i<rol; i++) {
			auths.add(new SimpleGrantedAuthority(roles[i]));
		}
		return auths;
	}
	
	
	public boolean crear(Usuario trabajadores) {
		repo.save(trabajadores);
		return true;
}

public boolean actualizar(Usuario usuario) {
	repo.save(usuario);
	return true;
}

public boolean borrar(long usuario) {
	try {
		Usuario art = repo.findById(usuario);
		repo.delete(art);
		return true;
	} catch (Exception e) {
		return false;
	}
}
	
	public List<Usuario> obtener(){
		return repo.findAll();
	}

public Usuario obtenerPorNombre(String usuario){
	return repo.findByUsuario(usuario);
}
	

}
