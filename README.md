# Gerador de PDF em Java

Este projeto demonstra como gerar relatórios em **PDF** utilizando a biblioteca **iText 7** em um projeto **Java com Maven**.  
O código segue uma estrutura simples de camadas:  
- **Model** (`Pessoa.java`): representação de dados.  
- **Service** (`PdfService.java`): responsável pela geração do PDF.  
- **Main** (`Main.java`): ponto de entrada da aplicação.  

---

## Descrição do Projeto

O objetivo do projeto é exemplificar o uso da biblioteca **iText 7** para criar arquivos PDF contendo textos e tabelas.  
O relatório gerado contém um título, um parágrafo introdutório e uma tabela com dados de pessoas (nome e idade).  

---

## Tecnologias utilizadas

- Java 17 ou superior  
- Maven 3.8 ou superior  
- iText 7 (biblioteca para criação e manipulação de PDFs)  

---

## Estrutura do projeto

```
pdf-gerador/
 ├─ pom.xml
 └─ src/
     └─ main/
         └─ java/
             └─ com/
                 └─ exemplo/
                     ├─ Main.java
                     ├─ model/
                     │    └─ Pessoa.java
                     └─ service/
                          └─ PdfService.java
```

---

## Configuração e instalação de dependências

1. Clonar o repositório:
   ```bash
   git clone https://github.com/seu-usuario/pdf-gerador.git
   cd pdf-gerador
   ```

2. Verificar o arquivo `pom.xml` para confirmar a dependência do **iText 7**:
   ```xml
   <dependency>
       <groupId>com.itextpdf</groupId>
       <artifactId>itext7-core</artifactId>
       <version>8.0.5</version>
       <type>pom</type>
   </dependency>
   ```

3. Instalar as dependências via Maven:
   ```bash
   mvn clean install
   ```

---

## Execução do build e do programa

Para compilar e executar o projeto, utilize o comando:

```bash
mvn exec:java
```

Após a execução, será gerado o arquivo:

```
relatorio.pdf
```

na pasta raiz do projeto.  

---

## Exemplo de saída esperada

O arquivo PDF conterá:  

- Um título: **Relatório de Pessoas**  
- Um parágrafo descritivo  
- Uma tabela com os dados fornecidos  

Tabela de exemplo:

| Nome   | Idade |
|--------|-------|
| Arthur | 25    |
| Maria  | 30    |
| João   | 28    |
