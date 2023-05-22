import java.time.LocalDate;
import java.util.Date;

public abstract class Produto {
    String titulo;
    String setor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getSetor(){
        return setor;
    }


    public String detalhesProduto(){
        String detalhesProduto = "Detalhes do livro " + titulo + ":\nLocalizado no setor: " + setor;
        return detalhesProduto;
    }
}
