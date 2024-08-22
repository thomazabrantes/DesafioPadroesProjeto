# Objetivo

Aplicar o padrão Decorator para permitir acrescentar diferentes niveis de log com facilidade.

Exemplos:

* Nivel 1: registra apenas a mensagem
* Nivel 2: registra a data junto da mensagem
* Nivel 3: registra a data e a hora junto da mensagem

Outros niveis de log podem adicionalmente: exibir a mensagem na tela no momento do registro, enviar um email de aviso para um operador pré cadastrado, exibir mensagens tipo "ATENÇÃO" ou "URGENTE" antes da mensagem etc

OBS: o uso do padrão Decorator deve eliminar, também, a necessidade do parâmetro adicional para indicar o nivel de log
