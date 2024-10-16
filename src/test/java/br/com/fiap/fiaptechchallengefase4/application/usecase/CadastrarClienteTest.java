package br.com.fiap.fiaptechchallengefase4.application.usecase;

import br.com.fiap.fiaptechchallengefase4.application.gateway.CadastrarClienteInterface;
import br.com.fiap.fiaptechchallengefase4.domain.entities.Cliente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class CadastrarClienteTest {

    @InjectMocks
    private CadastrarCliente cadastrarCliente;
    @Mock
    private CadastrarClienteInterface cadastrarClienteInterface;


    @Test
    @DisplayName("Deve cadastrar um cliente com sucesso")
    void cadastrarCliente() {
        Cliente cliente = new Cliente();
        when(cadastrarClienteInterface.cadastrarCliente(Mockito.<Cliente>any())).thenReturn(cliente);

        Cliente clienteCadastrado = cadastrarCliente.cadastrarCliente(new Cliente());

        verify(cadastrarClienteInterface).cadastrarCliente(isA(Cliente.class));
        assertSame(cliente, clienteCadastrado);
    }

}