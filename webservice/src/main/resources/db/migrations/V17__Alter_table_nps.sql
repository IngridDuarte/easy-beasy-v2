ALTER TABLE net_promoter_score ADD id_user bigint not null;
ALTER TABLE net_promoter_score ADD FOREIGN KEY (id_user) REFERENCES users;