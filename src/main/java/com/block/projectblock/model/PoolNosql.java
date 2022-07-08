package com.block.projectblock.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Document(collection = "PoolNosql")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PoolNosql {

    int id;
    String seudonimo;
    String name;
    String link;
    boolean activeDominio;

}
