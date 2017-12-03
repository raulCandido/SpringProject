package br.com.casadocodigo.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.models.Endereco;

@Repository
@Transactional
public class EnderecoDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	public void gravaEndereco(Endereco endereco){
		entityManager.persist(endereco);
	}
}
