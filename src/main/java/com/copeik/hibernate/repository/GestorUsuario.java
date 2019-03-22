package com.copeik.hibernate.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.copeik.hibernate.entity.Usuario;

public interface GestorUsuario extends JpaRepository<Usuario, Serializable> {

	public abstract Usuario findByUsuario(String usuario);
}
