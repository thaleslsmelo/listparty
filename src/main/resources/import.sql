INSERT INTO tb_product_List (names) VALUES ('Infantil');
INSERT INTO tb_product_List (names) VALUES ('Formaturas e 15Anos');
INSERT INTO tb_product_List (names) VALUES ('Casamentos');
INSERT INTO tb_product_List (names) VALUES ('Corporativos');

INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Tabuleiro Guloseimas', 400.8, 'Tabul', 'Party inf','https://raw.githubusercontent.com/thaleslsmelo/listparty/refs/heads/main/src/main/resources/imagens/Fini.png', 'Curta Descriçao:', 'Longa Descrição');
INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Tabuleiro Frutas', 470,'Tabul', 'Party inf','https://raw.githubusercontent.com/thaleslsmelo/listparty/refs/heads/main/src/main/resources/imagens/TabuFrutas.jpeg', 'Curta Descriçao:', 'Longa Descrição');
INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Tabuleiro Brigadeiro', 450, 'Tabul', 'Party inf and corporativo','https://raw.githubusercontent.com/thaleslsmelo/listparty/refs/heads/main/src/main/resources/imagens/quizeanos.jpeg', 'Curta Descriçao:', 'Longa Descrição');
INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Tabuleiro Corporativo', 350, 'Tabul', 'Party inf', 'https://raw.githubusercontent.com/thaleslsmelo/listparty/refs/heads/main/src/main/resources/imagens/corporativo.jpeg', 'Curta Descriçao:', 'Longa Descrição');
INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Tabuleiro 15anos/Casamento', 460, 'Tabul', 'Festas 15Anos','https://raw.githubusercontent.com/thaleslsmelo/listparty/refs/heads/main/src/main/resources/imagens/quizeanos.jpeg', 'Curta Descriçao:', 'Longa Descrição');
INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Carrinho', 40.7, 'Exper', 'Party inf,casamentos ','https://raw.githubusercontent.com/thaleslsmelo/listparty/refs/heads/main/src/main/resources/imagens/carrinho.png', 'Curta Descriçao:', 'Longa Descrição');
INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Baleira', 460, 'Recp', 'Party inf','https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/7.png', 'Personagem com Tabuleiro redondo', 'Longa Descrição');
INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Baloeiro', 480, 'Recp', 'Party inf','https://raw.githubusercontent.com/thaleslsmelo/listparty/refs/heads/main/src/main/resources/imagens/baloeiro2.jpeg', 'Personagem com Balões de gás Hélio', 'Longa Descrição');
INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Estação Gula', 480, 'Esta', 'Party inf', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/9.png', 'Curta Descriçao:', 'Longa Descrição');
INSERT INTO tb_product (names, price, category, ramo, img_url, short_description, long_description) VALUES ('Convite', 435, 'Init', 'All','https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/10.png', 'Curta Descriçao:', 'Longa Descrição');

INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (1, 3, 1);
INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (1, 2, 2);
INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (1, 4, 3);


INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (2, 1, 0);
INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (2, 6, 1);
INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (2, 3, 2);

INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (3, 2, 0);
INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (3, 3, 1);
INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (3, 6, 2);

INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (4, 6, 0);
INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (4, 7, 1);
INSERT INTO tb_belonging (prod_List_id, prod_id, position) VALUES (4, 9, 2);

