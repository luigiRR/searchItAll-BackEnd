/*CATEGORIA*/
INSERT INTO public.category ("name", comment1, comment2)
VALUES('Foot/Restaurantes', 'comidas', '');

/*TIPO NEGOCIO*/
INSERT INTO public.businesstype (categoryid, "name", comment1, comment2)
VALUES(1, 'Pollerias', '', '');

INSERT INTO public.businesstype (categoryid, "name", comment1, comment2)
VALUES(1, 'Cevicherias', '', '');

INSERT INTO public.businesstype (categoryid, "name", comment1, comment2)
VALUES(1, 'Chifas', '', '');

/*NEGOCIOS*/
INSERT INTO public.business
(businesstypeid, "name", address, numberphone, image, comment1, comment2)
VALUES(1, 'El Dorado', 'av algo', '1234', '', '', '');

INSERT INTO public.business
(businesstypeid, "name", address, numberphone, image, comment1, comment2)
VALUES(1, 'Ruben', 'av algo', '1234', '', '', '');

INSERT INTO public.business
(businesstypeid, "name", address, numberphone, image, comment1, comment2)
VALUES(2, 'Dfreud', 'av algo', '1234', '', '', '');

INSERT INTO public.business
(businesstypeid, "name", address, numberphone, image, comment1, comment2)
VALUES(2, 'Puerto-Callao', 'av algo', '1234', '', '', '');

INSERT INTO public.business
(businesstypeid, "name", address, numberphone, image, comment1, comment2)
VALUES(3, 'Kam-lee', 'av algo', '1234', '', '', '');

INSERT INTO public.business
(businesstypeid, "name", address, numberphone, image, comment1, comment2)
VALUES(2, 'Mey-chan', 'av algo', '1234', '', '', '');