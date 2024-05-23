import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Banco {
    private static Banco INSTACIA;
    private String nome;
    private List<Conta> contaList;

    private Banco() {
        this.nome = "Bradesco S/A";
        this.contaList = new ArrayList<Conta>();
    }

    public static Banco getInstance(){
        if (INSTACIA == null){
            INSTACIA = new Banco();
        }
        return INSTACIA;
    }

    public void imprimirContas(){
        System.out.println("Relação de contas");
        System.out.println("-----------------------------");
        System.out.println("Banco: " + nome.toUpperCase());
        contaList.stream().forEach(c -> System.out.println(c));
    }

    public void setContaList(Conta conta) {
        this.contaList.add(conta);
    }

    public List<Conta> getContaList(){
        return contaList;
    }

    public String getNome() {
        return nome;
    }
}
