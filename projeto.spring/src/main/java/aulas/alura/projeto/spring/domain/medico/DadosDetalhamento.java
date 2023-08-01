package aulas.alura.projeto.spring.domain.medico;

import aulas.alura.projeto.spring.domain.endereco.Endereco;

public record DadosDetalhamento(Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {
    public DadosDetalhamento(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
