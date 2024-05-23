import lombok.*;

@Getter
@AllArgsConstructor
public class Cliente {
    private String nome;

    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }
}
