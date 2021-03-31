#language: pt
Funcionalidade: Acessar os formularios da Tricentis
  Criando uma rotina de teste para validar o site Tricentis

  Cenario: Acessar e preencher o quarto formulario do site
    Dado que eu estou no site da Trincentis no formulario "Send Quota"
    E seleciono E-mail e digito "leticialimaferreira@gmail.com"
    E seleciono Phone e digito "61996132589"
    E seleciono Username e digito "felima"
    E seleciono Password e digito "Lele123"
    E seleciono Confirm Password e digito "Lele123"
    E seleciono Comments e digito "Aguardo um retorno imediato"
    Entao devo clicar em Send
