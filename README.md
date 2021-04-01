# Teste fomulários site Tricentis <br>
### Autora
 <sub><b><strong>Letícia Lima</strong></b></sub></a> <a >🚀</a>
---
[![Linkedin Badge](https://img.shields.io/badge/-Letícia-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leticia-flima/)](https://www.linkedin.com/in/leticia-flima/) 

Feito com ❤️ por Letícia 👋🏽 Accenture me contrata!

# Descrição do projeto em selenium webdrive (java) e cucumber usando Page objects
### 5 cenários distribuídos em 5 arquivos de casos de teste<br>
### Caso de teste 1
Acessar os formularios da Tricentis<br>
Criando uma rotina de teste para validar o site Tricentis<br>

<b>Cenário</b>: Acessar e preencher o primeiro formulario do site <br>
Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"<br>
E seleciono Make e clico em "Audi"<br>
E seleciono Model e clico em "Scooter"<br>
E informo em Cylinder Capacity "250"<br>
E informo em Engine Performance "10"<br>
E digito em Date of Manufacture "03/30/2021"<br>
E seleciono em Number of Seats e clico em "2"<br>
E seleciono em Right Hand Drive e clico em "Yes"<br>
E seleciono novamente Number of Seats e digito "2"<br>
E seleciono Fuel Type "Gas"<br><br>

### Caso de teste 2

<b>Cenário</b>: Acessar e preencher o segundo formulario do site<br>
Dado que eu estou no site da Trincentis no formulario "Enter Insurant Data"<br>
E seleciono First Name e digito "Leticia"<br>
E seleciono Last Name e digito em "Lima"<br>
E seleciono Date of Birth e digito "09/05/1998"<br>
E seleciono Gender e clico em "Female"<br>
E digito em Street Adress "Qr 401 conjunto 15 casa 16"<br>
E seleciono em Contry e clico em "Brazil"<br>
E seleciono em Zip Code e digito "72319015"<br>
E seleciono em City e digito "Brasília"<br>
E seleciono Occupation e seleciono "Employee"<br>
E seleciono Hobbies e clico em "Speeding"<br>
E informo em Website "www.learning.com.br"<br>
Entao devo clicar em Next para o formulario Enter Product Data<br><br>

### Caso de teste 3

<b>Cenário</b>: Acessar e preencher o terceiro formulario do site<br>
Dado que eu estou no site da Trincentis no formulario "Enter Product Data"<br>
E seleciono Start Date e digito "06/18/2021"<br>
E seleciono Insurance Sum e clico em "3.000.000,00"<br>
E seleciono Merit Rating e clico em "Bonus 1"<br>
E seleciono Damage Insurance e clico em "No Coverage"<br>
E seleciono Optional Products e clico em "Euro Protection"<br>
E seleciono Courtesy Car e clico em "Yes" <br>
Entao devo clicar em Next para o formulario Select Price Option<br><br>

### Caso de teste 4
<b>Cenário</b>: Acessar e preencher o quarto formulario do site<br>
Dado que eu estou no site da Trincentis no formulario "Select Price Option"<br>
E seleciono Select Option o plano Gold<br>
Entao devo clicar em Next para o formulario Send Quote<br><br>

### Caso de teste 5

<b>Cenário</b>: Acessar e preencher o quinto formulario do site<br>
Dado que eu estou no site da Trincentis no formulario "Send Quota"<br>
E seleciono E-mail e digito "leticialimaferreira@gmail.com"<br>
E seleciono Phone e digito "61996132589"<br>
E seleciono Username e digito "felima"<br>
E seleciono Password e digito "Lele123"<br>
E seleciono Confirm Password e digito "Lele123"<br>
E seleciono Comments e digito "Aguardo um retorno imediato"<br>
E devo clicar em Send<br>
Entao ver a mensagem "Sending e-mail success!"<br>

--------------------------------------------------------------------
## Dependencias
- cucumber-java<br>
- cucumber-junit<br>
- junit<br>
- selenium-java<br>
- junit-jupiter<br>

## Plugin
- maven-compiler<br>
--------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/Letiiciia/teste_selenium_individual_accenture
 ```

- Entrando na pasta do projeto
 ```bash
cd atividadeAccenture
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_win32.zip
unzip chromedriver_win32.zip
rm -rf chromedriver_win32.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

--------------------------------------------------------------------
## Estrutura de arquivos
<pre>
  driver <br>
      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- danilo<br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br> 
    |  |  |  |  |  |-- form1Step.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |  |  |  |  |-- form2Step.java <br>
    |  |  |  |  |  |-- form3Step.java <br>
    |  |  |  |  |  |-- form4Step.java <br>
    |  |  |  |  |  |-- form5Step.java <br>
    |  |  |  |  |
    
    |  |  |  | 
    
    |  |  |
    
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- danilo<br>
    |  |  |  |  |  |-- form1.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
    |  |  |  |  |  |-- form2.feature <br>
    |  |  |  |  |  |-- form3.feature <br>
    |  |  |  |  |  |-- form4.feature <br>
    |  |  |  |  |  |-- form5.feature <br>
    |  |  |  |  |
    
    |  |  |  | 
    
    |  |  |
    
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>
