package edu.cientifica.ISISGAV.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.model.Cliente;

@Service
public interface ClienteService {

	public List<Cliente> listarCliente();
}
