package Ex01;

import java.util.Random;

public class Consulta {
    private int id;
    private String dataConsulta;
    private String observacao;
    private Paciente paciente;
    private Medico medico;

    public Consulta(int id, String dataConsulta, String observacao, Paciente paciente) {
        this.id = new Random().nextInt(1000);
        this.dataConsulta = dataConsulta;
        this.observacao = observacao;
        this.paciente = paciente;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
