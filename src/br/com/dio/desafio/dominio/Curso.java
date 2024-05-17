package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private double avaliacao = 0.0;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public void setAvaliacao(double avaliacao){
        try{
            this.validarvaliacao(avaliacao);
            this.avaliacao = avaliacao;
        } catch (AvaliacaoException e){
            System.out.println(e.getMessage());
        }


    }

    public double getAvaliacao(){
        return this.avaliacao;
    }

    public void validarvaliacao(double avaliacao){
        if (avaliacao < 0 || avaliacao > 10.0){
            throw new AvaliacaoException("A avaliação deve estar entre 0 e 10");
        }
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", avaliacao=" + this.getAvaliacao() +
                '}';
    }
}
