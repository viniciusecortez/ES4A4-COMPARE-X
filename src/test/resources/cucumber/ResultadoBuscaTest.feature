Feature: Analisar os resultados da busca
"Eu como usuário,
devo ter acesso aos produtos que mais se assemelham à minha busca,
de forma que eu possa analisa-los"

Scenario: Devo conseguir ter acesso à lista de produtos
Given Estou na página de resultados da busca
Then Eu devo ver os resultados semelhantes à busca, por ordem de preço

Scenario: Devo conseguir escolher o produto específico de interesse
Given Estou na página de resultados da busca
When Clico no produto específico
Then Devo ser redirecionado para a página do produto