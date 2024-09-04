package questao2;

public class EventoTarefa extends Evento_init implements Evento{

    private String descricao;
    private boolean status_finalizado;

    public EventoTarefa(String descricao, boolean status_finalizado){
        super();
        this.descricao = descricao;
        this.status_finalizado = status_finalizado;
    }


    @Override
    public String getNomeEvento() {
        return this.getNome();
    }

    @Override
    public int getDataEvento() {
        return this.getData();
    }

    @Override
    public int getDuracao() {
        return this.getDuracao();
    }
    
}
