package sch.uv.mx.vista;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConexionMongoTest
{
    @Test
    public void puedeConectarseAMongoDB()
    {
        try (MongoClient conn = ConexionMongo.getConnection())
        {
            assertNotNull(ConexionMongo.getConnection());
        }
    }

    @Test
    public void puedeObtenerColeccion()
    {
        try (MongoClient conn = ConexionMongo.getConnection())
        {
            assertNotNull(ConexionMongo.getDatabase(conn));
        }
    }

    @Test
    public void puedeAccederAColecciones()
    {
        try (MongoClient conn = ConexionMongo.getConnection())
        {
            MongoDatabase db = ConexionMongo.getDatabase(conn);

            MongoCollection<Document> col = db.getCollection("usuarios");

            System.out.println(col);

            assertNotNull(col);
        }
    }

    @Test
    public void puedeAccederADocumento()
    {
        try (MongoClient conn = ConexionMongo.getConnection())
        {
            MongoDatabase db = ConexionMongo.getDatabase(conn);

            MongoCollection<Document> col = db.getCollection("usuarios");

            Document doc = col.find().first();

            String out = String.format("Document: %s %s %s %s %s %s %s %s",
                    doc.get("tipo_usuario"), doc.get("Nombre_Usuario"),
                    doc.get("Nombre"), doc.get("ApPat"), doc.get("ApMat"),
                    doc.get("Fecha_Nacimiento"), doc.get("contrEncriptada"),
                    doc.get("reputacion")
            );

            System.out.println(out);

            assertNotNull(doc);
        }
    }
}