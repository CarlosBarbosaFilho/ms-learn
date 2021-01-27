INSERT INTO TB_USERS (name,email, password) VALUES ('Carlos Barbosa', 'cbgomes@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO TB_USERS (name, email, password) VALUES ('Maria Alice', 'maria@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO TB_ROLES (name) VALUES ('ROLE_OPERATOR');
INSERT INTO TB_ROLES (name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_users_roles (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_users_roles (user_id, role_id) VALUES (2, 2);