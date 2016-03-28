select * from tenant;

// tenant data 생성
INSERT INTO tenant(tenant_id, super_tenant_id, super_tenant_yn, tenant_name) VALUES (1, null, 'Y', 'Super tenant');
INSERT INTO tenant(tenant_id, super_tenant_id, super_tenant_yn, tenant_name) VALUES (2, 1, 'N', 'sds');
INSERT INTO tenant(tenant_id, super_tenant_id, super_tenant_yn, tenant_name) VALUES (3, 1, 'N', 'posco');
commit;

// system data 생성
 select tenant0_.tenant_id as tenant_i1_1_,
 tenant0_.super_tenant_id as super_te2_1_,
 tenant0_.super_tenant_yn as super_te3_1_,
 tenant0_.tenant_name as tenant_n4_1_
 from tenant tenant0_
 right outer join system systems1_
	on tenant0_.tenant_id=systems1_.tenant_id
;

select * from system;

select *
  from tenant t
  left outer join system s
    on t.tenant_id = s.tenant_id
;