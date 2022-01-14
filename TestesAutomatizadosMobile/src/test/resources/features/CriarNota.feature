#language: pt
#encoding: UTF-8
Funcionalidade: Google Keep

  Contexto: 
    Dado que eu aciono o botao Get Started

  Cenario: Criar uma nota
    Quando que eu aciono o botao New Note
    E eu informar no campo Title "Nota1"
    E eu informar no campo Note "Nota"
    E eu acionar o botao voltar
    Entao o aplicativo cadastra a nota com o titulo "Nota1"

  Cenario: Interagir com o switch das configuracoes
    Quando eu acionar o menu
    E eu acionar a aba settings
    E eu tocar no switch
    Entao o switch fica desabilitado

  Cenario: editar nota
    Quando eu acionar a nota
    E eu informar no campo Title "NotaEditada"
    E eu informar no campo Note "NotaEditadaNota"
    E eu acionar o botao voltar
    Entao o aplicativo edita a nota com o titulo "NotaEditada"

  Cenario: excluir nota
    Quando eu tocar e segurar a nota
    E eu tocar nas opcoes
    E eu tocar em deletar
    Entao o sistema adiciona a nota na lixeira

  Cenario: clicar na scroll teste
    Quando eu clicar na scroll teste

  @cenario
  Cenario: Arrastar para a direita
    Quando eu arrastar a nota pra direita
    Entao o sistema arquiva a nota
