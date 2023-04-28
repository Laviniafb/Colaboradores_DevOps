public class Colaborador {
    private String nome;
    private String CPF;
    private long telefone;
    private String dataNasc;
    private String dataAgen;
    private String periodo;

    public Colaborador(String nome, String CPF, long telefone, String dataNasc, String dataAgen, String periodo) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.dataAgen = dataAgen;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getDataAgen() {
        return dataAgen;
    }

    public void setDataAgen(String dataAgen) {
        this.dataAgen = dataAgen;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "\nNovo Colaborador"+
                "\nNome: "+nome +
                "\nCPF: " + CPF +
                "\nTelefone: " + telefone +
                "\nData de Nascimento: " + dataNasc +
                "\nData de Agendamento: " + dataAgen +
                "\nPeriodo: " + periodo ;
    }
}
