package recursos;

@Path("categorias")
public class CategoriaRecurso {
    @GET
    public List<Produto> listar() {
        return Produto.listAll(Sort.ascending("nome"));
    }
}
