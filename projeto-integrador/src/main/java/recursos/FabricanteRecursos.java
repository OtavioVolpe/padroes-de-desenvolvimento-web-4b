package recursos;

import java.util.List;

import entidades.Fabricante;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("fabricantes")
public class FabricanteRecursos {
    @GET
    public List<Fabricante> listar() {
        return Fabricante.listAll(Sort.ascending("nome"));
    }
}
