<h1 align="center">
DesafioDeliveryMuchQA
</h1>

<h3 align="center">
Projeto de cobertura de testes automatizados para um serviço web que converte números decimais em sua versão por extenso.
</h3>

### Configuração Utilizada

 - Sistema Operacional 
     Windows 10(x64)
 - JDK 
     Versão 8u271
 - Gerenciador de Projetos
      Maven 3.6.3
 - Editor
      IntelliJIDEA 2020.2
 - Ferramenta
      Allure Test Report 2.13.7

### Instalação
  - Maven<br/>
        1- Baixar o Maven em https://maven.apache.org/download.cgi;<br/>
        2- Extrair o conteúdo baixado em um local do disco;<br/>
        3- Configurar na variável (Path) de ambiente do sistema o caminho ..\apache-maven-3.6.3\bin
      
  - Allure Test Report<br/>
        1- Baixar o allure em http://allure.qatools.ru/;<br/>
        2- Extrair em um local do disco;<br/>
        3- Configurar na variável (Path) de ambiente do sistema o caminho ..\allure-2.13.7\bin 
        
### 🎲 Executando os testes e gerando o relatório de falhas

```bash
# Clone este repositório
$ git clone <https://github.com/neilsonfaria/DesafioDeliveryMuchQA>

# Acesse a pasta do projeto no terminal/cmd
$ cd DesafioDeliveryMuchQA

# Execute os testes da classe ServicoWebTest 
$ mvn -Dtest=ServicoWebTest test

# Execute os testes da classe ServicoWebEnTest
$ mvn -Dtest=ServicoWebEnTest test

# Execute o Allure apontando para a pasta onde foi gerado o resultado dos testes
$ allure serve ..\DesafioDeliveryMuch\target\surefire-reports

# O relatório será exibido pelo navegador padrão
```

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Maven](https://maven.apache.org/)
- [JUnit](https://junit.org/)
- [Rest-Assured](https://rest-assured.io/)
- [Allure Test Report](http://allure.qatools.ru/)

### Autor
---
 <a href="http://www.linkedin.com/in/neilsonmfaria">
 <img style="border-radius: 40%;" src="https://avatars1.githubusercontent.com/u/915487?s=60&v=4" width="70px;" alt=""/>

[![Twitter Badge](https://img.shields.io/badge/-@neilsonfaria-1ca0f1?style=flat-square&labelColor=1ca0f1&logo=twitter&logoColor=white&link=https://twitter.com/neilsonfaria)](https://twitter.com/neilsonfaria) [![Linkedin Badge](https://img.shields.io/badge/-Neilson-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/neilsonmfaria/)](https://www.linkedin.com/in/neilsonmfaria/) 
[![Gmail Badge](https://img.shields.io/badge/-neilsonmfaria@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:neilsonmfaria@gmail.com)](mailto:neilsonmfaria@gmail.com)

