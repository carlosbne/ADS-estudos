package questao2;
import java.util.ArrayList;
public class EventoReuniao extends Evento_init implements Evento{

    static ArrayList<Participante> Participantes = new ArrayList<>();
    private String pauta;

    public EventoReuniao(String pauta){
        super();
        this.pauta = pauta;
    }

    public String getPauta(){
        return this.pauta;
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
