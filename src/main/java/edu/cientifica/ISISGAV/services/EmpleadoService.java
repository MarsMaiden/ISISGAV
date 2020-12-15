package edu.cientifica.ISISGAV.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.ISISGAV.model.Empleado;

@Service
public interface EmpleadoService {

	public List<Empleado> listarEmpleado();
}
