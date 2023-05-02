package com.springneo4j.springneo4jmapping.node;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.*;

@Node
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    @Id
    private Integer custId;
    private String name;
    private String[] address;
    @Relationship(type = "Purchase",direction = Relationship.Direction.OUTGOING)
    private List<Product> products;
}
