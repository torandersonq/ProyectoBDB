/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.servicio.implementacion;

import com.gmail.torandersonq.entidad.Empleado;
import com.gmail.torandersonq.excepcion.ObjectNotFoundException;
import com.gmail.torandersonq.excepcion.ParamRequiredException;
import com.gmail.torandersonq.pojo.EmpleadoDto;
import com.gmail.torandersonq.pojo.EmpleadoPaginadoDto;
import com.gmail.torandersonq.repositorio.IEmpleadoRepositorio;
import com.gmail.torandersonq.servicio.IEmpleadoServicio;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;

/**
 *
 * @author Ander
 */
@Stateless
public class EmpleadoServicio implements IEmpleadoServicio {

    @EJB
    private IEmpleadoRepositorio repositorio;

    public List<EmpleadoDto> listar() {
        List<Empleado> listaEmpleado = repositorio.listar();
        List<EmpleadoDto> listaEmpleadoDto = new ArrayList<>();

        for (Empleado lista : listaEmpleado) {
            ModelMapper modelMapper = new ModelMapper();
            EmpleadoDto empleadoDto = modelMapper.map(lista, EmpleadoDto.class);
            listaEmpleadoDto.add(empleadoDto);
        }
        return listaEmpleadoDto;
    }

    @Override
    public EmpleadoPaginadoDto listarPaginado(int pagina, int tamano) {

        List<Empleado> listaEmpelado = repositorio.listarPaginado(pagina, tamano);
        List<EmpleadoDto> listaEmpleadoDto = new ArrayList<>();

        for (Empleado empleado : listaEmpelado) {
            ModelMapper modelMapper = new ModelMapper();
            EmpleadoDto dto = modelMapper.map(empleado, EmpleadoDto.class);
            listaEmpleadoDto.add(dto);
        }

        EmpleadoPaginadoDto paginado = new EmpleadoPaginadoDto();
        paginado.setContenido(listaEmpleadoDto);
        paginado.setCantidad(repositorio.cantidadTotal());

        return paginado;
    }

    @Override
    public EmpleadoDto listarPorId(Integer id) throws ObjectNotFoundException {
        Empleado empleado = repositorio.listarPorId(id);
     
        if(empleado == null){
            throw new ObjectNotFoundException("Empleado no existe");
        }else{
            ModelMapper modelMapper = new ModelMapper();
            EmpleadoDto empleadodto = modelMapper.map(empleado, EmpleadoDto.class);
            return empleadodto;
        }
    }
    
    @Override
    public void guardar(Empleado empleado) throws ParamRequiredException {
        repositorio.guardar(empleado);
    }

    @Override
    public void editar(Empleado empleado) throws ParamRequiredException, ObjectNotFoundException {
        if (empleado.getId() == null) {
            throw new ParamRequiredException("Id requerido para editar");
        } else {
            Empleado empleadoAux = repositorio.listarPorId(empleado.getId());

            if (empleado == null) {
                throw new ObjectNotFoundException("Empleado no existe");
            }
            empleadoAux.setFuncion(empleado.getFuncion());
            empleadoAux.setNombreCompleto(empleado.getNombreCompleto());

            repositorio.editar(empleadoAux);
        }
    }

    @Override
    public void eliminar(Integer id) throws ObjectNotFoundException {
        Empleado empleado = repositorio.listarPorId(id);
        if(empleado == null){
            throw new ObjectNotFoundException("Empleado no existe.");
        }else{
            repositorio.eliminar(empleado);
        }
    }

}
