package sch.uv.mx.vista;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.jupiter.api.Test;
import sch.uv.mx.modelo.Estudiante;
import sch.uv.mx.modelo.Institucion;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class MongoDAOTest
{
    private Estudiante dummyEst;

    @Test
    public void puedeInsertar()
    {
        Supplier<Estudiante> dummy = () -> {
            return Estudiante.builder()
                    .contrEncriptada("1234").build();
//            return new Estudiante(
//                    "1234",
//                    "zs22001234@estudiantes.uv.mx",
//                    new Institucion(
//                            1,
//                            "Universidad",
//                            "estudiantes.uv.mx"
//                    )
//            );
        };

        new MongoDAO().insertar(dummy.get(), "usuarios");
    }

    public void
}