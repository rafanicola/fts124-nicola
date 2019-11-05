Feature: Busca Termo

	Scenario: Busca Termo Unico com Enter
		Given que acesso o site do Google
		When digito o termo "feriado" e pressiono Enter
	#	And pressiono o Enter
		Then Vejo os resultados e a guia "feriado - Pesquisa Google"
		
		#	Scenario: Busca Termo Unico com Clique
	#	Given que acesso o site do Google
	#	When digito o termo "feriado"
	#	And clico no botao Pesquisa Google
	#	Then Vejo os resultados e a guia "feriado - Pesquisa Google"