/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzaria.dao;

import br.com.pizzaria.entidade.Cliente;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author maria.sousa9
 */

// extends chama todos os métodos abstrados
//sobtender os baseDao por herança tenho abstrato
public interface ClienteDao extends BaseDao<Cliente, Long>{
    // o método cliente retorna a lista
    List<Cliente> pesquisarPorNome (String nome, Session sessao) throws HibernateException;
//    Pesquisar cliente por telefone e trazer todos os seus pedidos.
    Cliente pesquisarPorTelefone(String telefone, Session sessao) throws HibernateException;
}
