package src.bookboogie.jpa.system;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSystem is a Querydsl query type for System
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSystem extends EntityPathBase<System> {

    private static final long serialVersionUID = -1455842335L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSystem system = new QSystem("system");

    public final StringPath databaseName = createString("databaseName");

    public final StringPath jdbcName = createString("jdbcName");

    public final StringPath jdbcPw = createString("jdbcPw");

    public final StringPath jdbcUrl = createString("jdbcUrl");

    public final StringPath schemaName = createString("schemaName");

    public final QSystemId systemId;

    public final StringPath systemName = createString("systemName");

    public final src.bookboogie.jpa.tenant.QTenant tenant;

    public QSystem(String variable) {
        this(System.class, forVariable(variable), INITS);
    }

    public QSystem(Path<? extends System> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSystem(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSystem(PathMetadata<?> metadata, PathInits inits) {
        this(System.class, metadata, inits);
    }

    public QSystem(Class<? extends System> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.systemId = inits.isInitialized("systemId") ? new QSystemId(forProperty("systemId")) : null;
        this.tenant = inits.isInitialized("tenant") ? new src.bookboogie.jpa.tenant.QTenant(forProperty("tenant")) : null;
    }

}

