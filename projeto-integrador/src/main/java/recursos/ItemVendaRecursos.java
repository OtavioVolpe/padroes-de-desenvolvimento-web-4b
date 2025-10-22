package recursos;

@Path("itemVendas")
public class ItemVendaRecursos {
    @GET
    public List<Produto> listar() {
        return Produto.listAll(Sort.ascending("valorParcial"));
    }
}
