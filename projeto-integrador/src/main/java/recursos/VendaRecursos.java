package recursos;

@Path("vendas")
public class VendaRecursos {
    @GET
    public List<Produto> listar() {
        return Produto.listAll(Sort.ascending("horario"));
    }
}
