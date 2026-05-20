package sch.uv.mx.vista;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import org.bson.Document;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MongoDAO implements DAOGeneral
{
    @Override
    public <T> void insertar(T nuevaEnt, String nombreColeccion)
    {
        var db = ConexionMongo.getDatabase();
        var collection = db.getCollection(nombreColeccion);

        Document doc = Document.parse(new Gson().toJson(nuevaEnt));

        collection.insertOne(doc);
    }

    @Override
    public List<Document> buscarTodos(String nombreColeccion)
    {
        List<Document> list = new ArrayList<>();
        var db = ConexionMongo.getDatabase();
        var collection = db.getCollection(nombreColeccion);

        FindIterable<Document> busc = collection.find();

        busc.forEach(list::add);

        return list;
    }

    @Override
    public <ID> void eliminar(ID id, String nombreColeccion)
    {


    }
}
