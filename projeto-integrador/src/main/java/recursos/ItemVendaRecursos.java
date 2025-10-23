package recursos;

import java.util.List;

import entidades.ItemVenda;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("itemVendas")
public class ItemVendaRecursos {
    @GET
    public List<ItemVenda> listar() {
        return ItemVenda.listAll(Sort.ascending("valorParcial"));
    }
}
