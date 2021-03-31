#language: pt
Funcionalidade: Acessar os formularios da Tricentis
  Criando uma rotina de teste para validar o site Tricentis

  Cenario: Acessar e preencher o segundo formulario do site
    Dado que eu estou no site da Trincentis no formulario "Enter Insurant Data"
    E seleciono First Name e digito "Leticia"
    E seleciono Last Name e digito em "Lima"
    E seleciono Date of Birth e digito "09/05/1998"
    E seleciono Gender e clico em "Female"
    E digito em Street Adress "Qr 401 conjunto 15 casa 16"
    E seleciono em Contry e clico em "Brazil"
    E seleciono em Zip Code e digito "72319015"
    E seleciono em City e digito "Brasília"
    E seleciono Occupation e seleciono "Employee"
    E seleciono Hobbies e clico em "Speeding"
    E informo em Website "www.learning.com.br"
    Entao devo clicar em Next para o formulario Enter Product Data