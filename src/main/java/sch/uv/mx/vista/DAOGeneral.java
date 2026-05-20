package sch.uv.mx.vista;

import org.bson.Document;

import java.util.List;

public interface DAOGeneral
{
    <T> void insertar(T nuevaEnt, String col);
    List<Document> buscarTodos(String nombreColeccion);
    <ID> void eliminar(ID id, String nombreColeccion);
}
