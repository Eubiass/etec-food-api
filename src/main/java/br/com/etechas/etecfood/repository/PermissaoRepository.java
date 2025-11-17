package br.com.etechas.etecfood.repository;

import br.com.etechas.etecfood.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
// Interface responsável por fornecer métodos de CRUD para a entidade Permissao
// Herdando métodos padrão do JpaRepository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}
