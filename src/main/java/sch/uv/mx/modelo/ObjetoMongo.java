package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import javax.persistence.Id;

public abstract class ObjetoMongo
{
    private ObjectId oid;

    public ObjetoMongo()
    {
    }

    public ObjetoMongo(ObjectId oid)
    {
        this.oid = oid;
    }

    public ObjectId getOid()
    {
        return oid;
    }

    public void setOid(ObjectId oid)
    {
        this.oid = oid;
    }
}
