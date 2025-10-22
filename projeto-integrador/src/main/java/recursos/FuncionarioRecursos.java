package recursos;

@Path("funcionarios")
public class FuncionarioRecursos {
    @GET
    public List<Produto> listar() {
        return Produto.listAll(Sort.ascending("nome"));
    }
}
