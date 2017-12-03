package br.com.casadocodigo.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.models.Usuario;

@Repository
@Transactional
public class UsuarioDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void gravarUsuario(Usuario usuario) {
		entityManager.persist(usuario);
	}

	public List<Usuario> listarUsuario() {
		return entityManager.createQuery("select u from Usuario u", Usuario.class).getResultList();
	}
}
