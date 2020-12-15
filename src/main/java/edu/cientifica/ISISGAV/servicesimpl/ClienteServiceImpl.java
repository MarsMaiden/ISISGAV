package edu.cientifica.ISISGAV.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.ClienteMapper;
import edu.cientifica.ISISGAV.model.Cliente;
import edu.cientifica.ISISGAV.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteMapper clienteMapper;

	@Override
	public List<Cliente> listarCliente() {
		return clienteMapper.listarCliente();
	}
}