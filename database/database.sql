/*create table departement(
    code_dep int,
    intitule_dep varchar(191),
    nom varchar(191),
    not_chef varchar(191),
    prenom_chef varchar(191),
    constraint pk_departement primary key(code_dep)
);
create table employe(
    code_emp int,
    nom_emp varchar(191),
    prenom varchar(191),
    grade_emp varchar(191),
    fonction varchar(191),
    code_dep int,
    constraint pk_employe primary key(code_emp),
    constraint fk_employe_departement foreign key(code_dep) references departement(code_dep)
);

create table categorie(
    num_cat int,
    categorie varchar(191),
    CONSTRAINT pk_categorie PRIMARY KEY (num_cat)
);

create table produit(
    code_pro int,
    designation varchar(191),
    qte_stock int,
    date_stock date,
    seuil int,
    type_pro varchar(191),
    num_cat int,
    constraint pk_produit primary key(code_pro),
    constraint fk_produit_categorie foreign key (num_cat) references categorie(num_cat)
);

create table fournisseur(
    code_fournisseur int,
    nom_fournisseur varchar(191),
    num_compte int,
    num_tel int,
    constraint pk_fournisseur primary key(code_fournisseur)
);

create table bon_sortie(
    num_bso int,
    date_sor date,
    code_emp int,
    constraint pk_bso primary key(num_bso),
    constraint fk_bso_employe foreign key(code_emp) references employe(code_emp)
);

create table se_refere(
    num_bso int,
    code_pro int,
    qte_sortie int,
    constraint pk_se_refere primary key(num_bso,code_pro),
    constraint fk_se_refere_bso foreign key(num_bso) references bon_sortie(num_bso),
    constraint fk_se_refere_produit foreign key(code_pro) references produit(code_pro)
);

create table bon_affectation(
    num_baf int,
    date_aff date,
    code_emp int,
    constraint pk_baf primary key(num_baf),
    constraint fk_baf_employe foreign key(code_emp) references employe(code_emp)
);

create table concerner(
    num_baf int,
    code_pro int,
    qte_aff int,
    constraint pk_concerner primary key(num_baf,code_pro),
    constraint fk_concerner_baf foreign key(num_baf) references bon_affectation(num_baf),
    constraint fk_concerner_produit foreign key(code_pro) references produit(code_pro)
);
select * from user_constraints where constraint_name like '%CONCERNE%';
create table commande(
    num_bco int,
    date_com date,
    code_fournisseur int,
    constraint pk_commande primary key(num_bco),
    constraint fk_commande_fournisseur foreign key(code_fournisseur) references fournisseur(code_fournisseur)
);

create table contenir(
    num_bco int,
    code_pro int,
    qte_cde int,
    constraint pk_contenir primary key(num_bco,code_pro),
    constraint fk_contenir_commande foreign key(num_bco) references commande(num_bco),
    constraint fk_contenir_produit foreign key(code_pro) references produit(code_pro)
);

create table bon_livraison(
    num_bliv int,
    date_liv date,
    quantite int,
    constraint pk_bon_livraison primary key(num_bliv)
);

create table renfermer(
    num_bliv int,
    code_pro int,
    qte_liv int,
    constraint pk_renfermer primary key(num_bliv,code_pro),
    constraint fk_renfermer_bliv foreign key(num_bliv) references bon_livraison(num_bliv),
    constraint fk_renfermer_produit foreign key(code_pro) references produit(code_pro)
);*/
/*
alter table departement add constraint pk_departement primary key(code_dep);
alter table employe(
    add constraint pk_employe primary key(code_emp),
    add constraint fk_employe_departement foreign key(code_dep) references departement(code_dep));
alter table categorie add CONSTRAINT pk_categorie PRIMARY KEY (num_cat);
alter table produit (add 
    constraint pk_produit primary key(code_pro),
    add constraint fk_produit_categorie foreign key (num_cat) references categorie(num_cat);
alter table fournisseur add constraint pk_fournisseur primary key(code_fournisseur);
alter table renfermer add constraint pk_renfermer primary key(num_bliv,code_pro));
alter table bon_sortie (add 
    constraint pk_bso primary key(num_bso),
    add constraint fk_bso_employe foreign key(code_emp) references employe(code_emp));
alter table se_refere (add
    constraint pk_se_refere primary key(num_bso,code_pro),
    add constraint fk_se_refere_bso foreign key(num_bso) references bon_sortie(num_bso),
    add constraint fk_se_refere_produit foreign key(code_pro) references produit(code_pro));
alter table bon_affectation (
    add constraint pk_baf primary key(num_baf),
    add constraint fk_baf_employe foreign key(code_emp) references employe(code_emp));
alter table concerner 
    add constraint pk_concerner primary key(num_baf,code_pro),
    add constraint fk_concerner_baf foreign key(num_baf) references bon_affectation(num_baf),
    add constraint fk_concerner_produit foreign key(code_pro) references produit(code_pro));
alter table commande (
    add constraint pk_commande primary key(num_bco),
    add constraint fk_commande_fournisseur foreign key(code_fournisseur) references fournisseur(code_fournisseur)
    );
alter table contenir 
    add constraint pk_contenir primary key(num_bco,code_pro),
    add constraint fk_contenir_bco foreign key(num_bco) references commande(num_bco),
    add constraint fk_contenir_produit foreign key(code_pro) references produit(code_pro);
alter table bon_livraison add
    constraint pk_bon_livraison primary key(num_bliv);
alter table renfermer add
    constraint pk_renfermer primary key(num_bliv,code_pro),
    add constraint fk_renfermer_bliv foreign key(num_bliv) references bon_livraison(num_bliv),
    add constraint fk_renfermer_produit foreign key(code_pro) references produit(code_pro);
*//*
drop table renfermer;
drop table bon_livraison;
drop table employe;
drop table departement;
drop table produit;
drop table categorie;
drop table fournisseur;
drop table bon_sortie;
drop table se_refere;
drop table bon_affectation;
drop table concerner;
drop table commande;
drop table contenir;
*/

/*select * from user_tables;
*/

select count(*) from user_constraints where trunc(last_change) = DATE '2021-02-18';
select tablespace_name,file_name,bytes/1024/1024 as size_in_mb,status from dba_temp_files;
select tablespace_name from dba_tablespaces;
create tablespace TB_MINIPROJET 
    DATAFILE 'E:\projects\tablespace\tbs_miniprojet.dbf' size 100M AUTOEXTEND on online;
    online;
create TEMPORARY tablespace temp_miniprojet 
    TEMPFILE 'E:\projects\tablespace\temp_miniprojet.dbf' size 30m autoextend on;
create undo tablespace undo_miniprojet
    datafile 'E:\projects\tablespace\undo_miniprojet.dbf' size 50m autoextend on online;


/*create users*/    
create user administrateur identified by 123456 
    default tablespace tb_miniprojet
    temporary tablespace temp_miniprojet
    password expire;

create user utilisateur1 identified by 123456
    default tablespace tb_miniprojet
    temporary tablespace temp_miniprojet
    password expire;
    
create user utilisateur2 identified by 123456
    default tablespace tb_miniprojet
    temporary tablespace temp_miniprojet
    password expire;
/*end creation des utilisateurs*/
/*creation des roles*/
create role dbadmin;
create role gestion_interne;
create role gestion_externe;
/*privilege*/
grant dba to dbadmin;
grant dbadmin to administrateur;
grant create session to gestion_interne;
grant create session to gestion_externe;
grant 

grant gestion_interne to utilisateur1;
grant gestion_externe to utilisateur2;


/* moving the tables to the new tablespace */
alter table employe move tablespace tb_miniprojet;
alter table categorie move tablespace tb_miniprojet;
alter table departement move tablespace tb_miniprojet;
alter table produit move tablespace tb_miniprojet;
alter table fournisseur move tablespace tb_miniprojet;
alter table bon_sortie move tablespace tb_miniprojet;
alter table se_refere move tablespace tb_miniprojet;
alter table bon_affectation move tablespace tb_miniprojet;
alter table concerner move tablespace tb_miniprojet;
alter table commande move tablespace tb_miniprojet;
alter table contenir move tablespace tb_miniprojet;
alter table bon_livraison move tablespace tb_miniprojet;
alter table renfermer move tablespace tb_miniprojet;


