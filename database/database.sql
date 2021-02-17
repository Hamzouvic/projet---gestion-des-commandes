create table employe(
    code_emp int,
    nom_emp varchar(191),
    prenom varchar(191),
    grade_emp varchar(191),
    fonction varchar(191),
    code_dep int
);
create table departement(
    code_dep int,
    intitule_dep varchar(191),
    nom varchar(191),
    not_chef varchar(191),
    prenom_chef varchar(191)
);

create table produit(
    code_pro int,
    designation varchar(191),
    qte_stock int,
    date_stock date,
    seuil int,
    type_pro varchar(191),
    num_cat int
);

create table categorie(
    num_cat int,
    categorie varchar(191)
);

create table fournisseur(
    code_fournisseur int,
    nom_fournisseur varchar(191),
    num_compte int,
    num_tel int
);

create table bon_sortie(
    num_bso int,
    date_sor date,
    com_emp int
);

create table se_refere(
    num_bso int,
    code_pro int,
    qte_sortie int
);

create table bon_affectation(
    num_baf int,
    date_aff date,
    code_emp int
);

create table concerner(
    num_baf int,
    code_prod int,
    qte_aff int
);

create table commande(
    num_bco int,
    date_com date,
    code_fournisseur int
);

create table contenir(
    num_bco int,
    code_pro int,
    qte_cde int
);

create table bon_livraison(
    num_bliv int,
    date_liv date,
    quantité int
);

create table renfermer(
    num_bliv int,
    code_pro int,
    qte_liv int
);
/*
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
