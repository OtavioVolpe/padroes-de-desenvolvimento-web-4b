package recursos;

@Path("fabricantes")
public class FabricanteRecursos {
    @GET
    public List<Produto> listar() {
        return Produto.listAll(Sort.ascending("nome"));
    }
}
