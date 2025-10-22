package recursos;

@Path("clientes")
public class ClienteRecurso {
    @GET
    public List<Produto> listar() {
        return Produto.listAll(Sort.ascending("nome"));
    }
}
