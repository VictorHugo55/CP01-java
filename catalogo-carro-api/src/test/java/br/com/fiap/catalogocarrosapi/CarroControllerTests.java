package br.com.fiap.catalogocarrosapi;
import br.com.fiap.catalogocarrosapi.controller.CarroController;
import br.com.fiap.catalogocarrosapi.model.Carro;
import br.com.fiap.catalogocarrosapi.model.TipoVeiculo;
import br.com.fiap.catalogocarrosapi.service.CarroService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import java.util.Collections;
import java.util.Optional;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CarroController.class)
class CarroControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarroService carroService;

    @Test
    void deveRetornarTop10Potencia() throws Exception {
        when(carroService.top10Potencia()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/carros/potencia"))
                .andExpect(status().isOk());
    }

    @Test
    void deveRetornarCarroPorId() throws Exception {
        Carro carro = new Carro();
        carro.setId(1L);
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2024);
        carro.setTipo(TipoVeiculo.HIBRIDO);

        when(carroService.getById(1L)).thenReturn(Optional.of(carro));

        mockMvc.perform(get("/carros/1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}