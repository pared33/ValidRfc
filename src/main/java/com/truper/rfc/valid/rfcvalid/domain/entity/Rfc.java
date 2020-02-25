package com.truper.rfc.valid.rfcvalid.domain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Rfc {

    @Id
    @Indexed
    private String id;

    private Boolean isBlock;

    public Rfc() {
    }

    public Rfc(String id, Boolean isBlock) {
        this.id = id;
        this.isBlock = isBlock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getBlock() {
        return isBlock;
    }

    public void setBlock(Boolean block) {
        isBlock = block;
    }


}
