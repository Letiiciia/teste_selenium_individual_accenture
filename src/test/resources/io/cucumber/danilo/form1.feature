#language: pt
Funcionalidade: Acessar os formularios da Tricentis
  Criando uma rotina de teste para validar o site Tricentis

  Cenario: Acessar e preencher o primeiro formulario do site
    Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"
    E seleciono Make e clico em "Audi"
    E seleciono Model e clico em "Scooter"
    E informo em Cylinder Capacity "250"
    E informo em Engine Performance "10"
    E digito em Date of Manufacture "03/30/2021"
    E seleciono em Number of Seats e clico em "2"
    E seleciono em Right Hand Drive e clico em "Yes"
    E seleciono novamente Number of Seats e digito "2"
    E seleciono Fuel Type "Gas"
    E informo em Payload "300"
    E informo em Total Weight "300"
    E informo em List Price "1000"
    E informo em License Plate Number "3358"
    E informo em Annual Mileage "10000"
    Entao devo clicar em Next para o formulario Insurant Data
