package com.truper.rfc.valid.rfcvalid.domain.repository;

import com.truper.rfc.valid.rfcvalid.domain.entity.Rfc;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RfcRepository extends MongoRepository<Rfc, String> {
    Rfc findById(ObjectId _id);

    Rfc findByIsBlock(Boolean aBoolean);
}
