package src.bookboogie.jpa.tenant;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTenant is a Querydsl query type for Tenant
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTenant extends EntityPathBase<Tenant> {

    private static final long serialVersionUID = 35220353L;

    public static final QTenant tenant = new QTenant("tenant");

    public final StringPath superTenantId = createString("superTenantId");

    public final StringPath superTenantYn = createString("superTenantYn");

    public final ListPath<src.bookboogie.jpa.system.System, src.bookboogie.jpa.system.QSystem> systems = this.<src.bookboogie.jpa.system.System, src.bookboogie.jpa.system.QSystem>createList("systems", src.bookboogie.jpa.system.System.class, src.bookboogie.jpa.system.QSystem.class, PathInits.DIRECT2);

    public final NumberPath<Long> tenantId = createNumber("tenantId", Long.class);

    public final StringPath tenantName = createString("tenantName");

    public QTenant(String variable) {
        super(Tenant.class, forVariable(variable));
    }

    public QTenant(Path<? extends Tenant> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTenant(PathMetadata<?> metadata) {
        super(Tenant.class, metadata);
    }

}

