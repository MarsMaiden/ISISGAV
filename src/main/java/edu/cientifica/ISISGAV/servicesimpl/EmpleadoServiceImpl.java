package edu.cientifica.ISISGAV.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.mappers.EmpleadoMapper;
import edu.cientifica.ISISGAV.model.Empleado;
import edu.cientifica.ISISGAV.services.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoMapper empleadoMapper;

	@Override
	public List<Empleado> listarEmpleado() {
		return empleadoMapper.listarEmpleado();
	}
}
