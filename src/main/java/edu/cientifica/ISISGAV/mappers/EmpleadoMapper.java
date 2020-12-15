package edu.cientifica.ISISGAV.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.cientifica.ISISGAV.model.Empleado;

@Mapper
public interface EmpleadoMapper {
	
	public List<Empleado> listarEmpleado();

}
