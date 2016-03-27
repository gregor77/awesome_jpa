package src.bookboogie.jpa.system;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSystemId is a Querydsl query type for SystemId
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QSystemId extends BeanPath<SystemId> {

    private static final long serialVersionUID = 1094856924L;

    public static final QSystemId systemId = new QSystemId("systemId");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final NumberPath<Long> tenantId = createNumber("tenantId", Long.class);

    public QSystemId(String variable) {
        super(SystemId.class, forVariable(variable));
    }

    public QSystemId(Path<? extends SystemId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSystemId(PathMetadata<?> metadata) {
        super(SystemId.class, metadata);
    }

}

