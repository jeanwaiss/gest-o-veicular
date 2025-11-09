 Sistema de Gestão de Estoque de Veículos
Sistema completo para gestão de estoque de veículos desenvolvido em Spring Boot com interface web moderna.

📋 Sobre o Projeto
Este sistema foi desenvolvido como trabalho acadêmico para a disciplina de Programação Orientada a Objetos. Permite o gerenciamento completo de estoque de veículos em uma concessionária.

🛠️ Tecnologias Utilizadas
Backend: Java 17, Spring Boot 3.2.0, Spring Data JPA

Frontend: HTML5, CSS3, JavaScript

Banco de Dados: H2 Database (em memória)

Build Tool: Maven

Arquitetura: MVC + REST API

🚀 Funcionalidades
✅ Cadastro de veículos (modelo, marca, ano, cor, preço, quilometragem, status)

✅ Listagem de veículos com interface moderna

✅ Filtros por marca e status

✅ Operações CRUD completas (Criar, Ler, Atualizar, Deletar)

✅ API REST para integração

✅ Interface web responsiva

📁 Como Executar
Pré-requisitos
Java 17 ou superior

Maven

Passos para execução:
Clone o repositório:

bash
git clone https://github.com/jeanwaiss/gestao-veiculos-springboot.git
Execute a aplicação:

bash
mvn spring-boot:run
Acesse os seguintes endereços:

🎨 Interface Web: http://localhost:8080

🔗 API REST: http://localhost:8080/api/veiculos

🗄️ Console H2: http://localhost:8080/h2-console

Configuração do Banco H2:
JDBC URL: jdbc:h2:mem:testdb

User Name: sa

Password: (deixe em branco)

📡 Endpoints da API
Método	Endpoint	Descrição
GET	/api/veiculos	Listar todos os veículos
POST	/api/veiculos	Criar novo veículo
GET	/api/veiculos/{id}	Buscar veículo por ID
PUT	/api/veiculos/{id}	Atualizar veículo
DELETE	/api/veiculos/{id}	Excluir veículo
GET	/api/veiculos/filtro/marca/{marca}	Filtrar por marca
GET	/api/veiculos/filtro/status/{status}	Filtrar por status
🏗️ Estrutura do Projeto
text
src/main/java/com/concessionaria/
├── GestaoVeiculosApplication.java     # Classe principal
├── model/Veiculo.java                 # Entidade Veículo
├── repository/VeiculoRepository.java   # Interface de dados
├── service/VeiculoService.java         # Lógica de negócio
└── controller/VeiculoController.java   # Controlador REST

src/main/resources/
├── application.properties             # Configurações
└── static/index.html                  # Interface web
💻 Exemplo de Uso
Cadastrar veículo via API:
json
POST /api/veiculos
{
    "modelo": "Civic",
    "marca": "Honda",
    "ano": 2023,
    "cor": "Preto",
    "preco": 120000.00,
    "quilometragem": 0.0,
    "status": "DISPONIVEL"
}
Filtrar veículos:
bash
GET /api/veiculos/filtro/marca/Honda
GET /api/veiculos/filtro/status/DISPONIVEL
👨‍💻 Autor
Jean Waiss
Trabalho acadêmico - Programação Orientada a Objetos
UniFECAF - 2025

📄 Licença
Este projeto está sob a licença MIT - veja o arquivo LICENSE para detalhes.

🎯 Status do Projeto: ✅ Concluído e Funcional
📅 Última Atualização: Novembro 2025
