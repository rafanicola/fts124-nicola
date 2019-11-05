#language: pt
Funcionalidade: Buscar por termo
	Se aplica a qualquer usuário
	Cenario: Busca com sucesso por uma unica palavra
		Dado que acesso o site do Google
		Quando digito o termo "feriado"
		E clico no Enter
		Entao exibe a lista de resultados com o titulo "feriado - Pesquisa Google"